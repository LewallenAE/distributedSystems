package main

import (
	"bytes"
	"encoding/json"
	"io"
	"log"
	"net/http"
	"time"
	
)

type Transactions struct {
	Amount float64 `json:"Amount"`
	Description string `json:"Description"`
}

func healthHandler(w http.ResponseWriter, _ *http.Request){
	w.WriteHeader(http.StatusOK)
	io.WriteString(w, "OK")
}

func Post("http://localhost:8080/", contentType String, body io.Reader)

// type Transaction struct {
//	 Amount float64
// 	 Description string
//} 

func main() {

	http.HandleFunc("/health", healthHandler)

	server := &http.Server {
		Addr: ":8080",
		Handler: nil,
		ReadTimeout: 10 * time.Second,
		WriteTimeout: 10 * time.Second,
		IdleTimeout: 15 * time.Second,
	}

	rawJson := `{"Amount": 125.00, "Description": "initial deposit"}`
	ledgerDecode := json.NewDecoder(strings.NewReader(rawJson))

	var tx Transactions
	if err := ledgerDecode.Decode(&tx); err != nil {
		log.Fatalf("failed to decode JSON: %v", err)
	}
	resp, err := http.Post("http://localhost:8080/transactions", application/json, )

	fmt.Printf("Decoded struct: %+v\n", tx)
	fmt.Printf("Amount: %d, Description: %s\n", tx.Amount, tx.Description)

	log.Println("Health check server starting on localhost: 8080")
	log.Fatal(server.ListenAndServe())
	
	
}