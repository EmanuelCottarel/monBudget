INSERT INTO transaction_type (name) VALUES ('Income');
INSERT INTO transaction_type (name) VALUES ('Expense');
INSERT INTO transaction_type (name) VALUES ('Investment');

INSERT INTO category (name) VALUES ('Leisure');
INSERT INTO category (name) VALUES ('Fixed Expenses');
INSERT INTO category (name) VALUES ('Variable Expenses');

INSERT INTO user_ (first_name, last_name, email, password) VALUES ('John', 'Doe', 'john.doe@example.com', 'password123');
INSERT INTO user_ (first_name, last_name, email, password) VALUES ('Jane', 'Smith', 'jane.smith@example.com', 'password456');
INSERT INTO user_ (first_name, last_name, email, password) VALUES ('Alice', 'Johnson', 'alice.johnson@example.com', 'password789');

INSERT INTO account_type (name, interest_rate) VALUES ('Livret A', 1.5);
INSERT INTO account_type (name, interest_rate) VALUES ('Compte courant', 0.5);
INSERT INTO account_type (name, interest_rate) VALUES ('LEP', 2.0);

INSERT INTO account (name, balance, type_id, user_id) VALUES ('Personal Savings', 1500.00, 1, 1);
INSERT INTO account (name, balance, type_id, user_id) VALUES ('Business Checking', 3000.00, 2, 1);
INSERT INTO account (name, balance, type_id, user_id) VALUES ('Investment Fund', 5000.00, 3, 2);

INSERT INTO transaction (name, amount, account_id, type_id, category_id) VALUES ('Grocery Shopping', 50.75, 1, 1, 3);
INSERT INTO transaction (name, amount, account_id, type_id, category_id) VALUES ('Salary Payment', 2000.00, 2, 2, 2);
INSERT INTO transaction (name, amount, account_id, type_id, category_id) VALUES ('Movie Night', 15.00, 3, 1, 1);
