package server

import (
	"fmt"
	"sync"
)

type Record struct {
	Value []byte `json:"value"`
	Offset uint64 `json:"offset"`
}

type Log struct {
	mu sync.RWMutex 
	records []Record
}

func NewLog() *Log {
	return &Log{}
}

func (l *Log) Append(record Record) (uint64, error) {
	l.mu.Lock()
	defer l.mu.Unlock()

	record.Offset = uint64(len(l.records))
	l.records = append(l.records, record)

	return record.Offset, nil
}

var ErrOffsetNotFound = fmt.Errorf("offset not found.")

func (l *Log) Read(offset uint64) (Record, error) {
	l.mu.RLock()
	defer l.mu.RUnlock()

	if offset >= uint64(len(l.records)) {
		return Record{}, ErrOffsetNotFound
	}else {
		return l.records[offset], nil
	}
}

