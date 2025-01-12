package models

type UserRequest struct {
	ID        int    `json:"id"`
	FirstName string `json:"firstName"`
	LastName  string `json:"lastName"`
	Email     string `json:"email"`
}

type FraudResponse struct {
	Result string `json:"result"`
}