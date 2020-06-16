Feature: Checkmate Scenarios for CA State




Scenario: Loan– same day Void with secret code
 	 			Given CA_PDL_014
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		#Then History




Scenario: Loan – void on next day with secret code
 	 			Given CA_PDL_015
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then A_Age the store to "1"
    		Then Void the transaction
    		##Then History
    		

   		
Scenario: loan with disbursement cash ->void with cash
 	 			Given CA_PDL_016
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		Then Void the transaction   	
    		#Then History	


Scenario: loan with disbursement cash ->void with DC
 	 			Given CA_PDL_017
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		Then Void the transaction 
    		#Then History

Scenario: Loan– same day Rescind
 	 			Given CA_PDL_019
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		Then Rescind the transaction   
    		##Then History
    

Scenario: New Loan --> Age store up to some days before due date --> Partial Payment.
 	 			Given CA_PDL_051
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment Same No
				#Then History

Scenario: New Loan --> Age store up to some days after due date --> Check Partial Payment transaction is displayed or not.
 	 			Given CA_PDL_052
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Due Date from History
    		Then Age the store to "5"
    		Then Partial Payment Same No   
    		#Then History     

Scenario: Advance =>Partial Payment with 2 tender types as MO with different numbers =>Transaction should not be processed
 	 			Given CA_PDL_053
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment Diff No     
    		#Then History       

Scenario: Advance =>Partial Payment with 2 tender types as MO with same numbers =>Transaction should not be processed
 	 			Given CA_PDL_054
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment Same No  
				#Then History 
				

Scenario: Advance =>Partial Payment with 2 tender types as CCK with diff numbers =>Transaction should not be processed
 	 			Given CA_PDL_055
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment Diff No 
				#Then History
				
 
Scenario: Advance =>Partial Payment with 2 tender types as CCK and MO =>Transaction should be processed
 	 			Given CA_PDL_056
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment Diff No 
			#Then History
			
		
Scenario: Advance =>Partial Payment with 2 tender types as Cash =>Transaction should not be processed
 	 			Given CA_PDL_057
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment Diff No  
			#Then History
			
		
Scenario: Advance =>Partial Payment with tender types as Cash  =>Transaction should be processed
 	 			Given CA_PDL_058
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment 	
			#Then History
			

Scenario: Advance =>Partial Payment with tender types as CCK  =>Transaction should be processed
 	 			Given CA_PDL_059
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
  			#Then History
  			
  
 Scenario: Advance =>Partial Payment with tender types as CK  =>Transaction should be processed
 	 			Given CA_PDL_060
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
			#Then History
			

 Scenario: Advance =>Partial Payment with tender types as MO  =>Transaction should be processed
 	 			Given CA_PDL_061
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    				#Then History

 Scenario: Loan -- Age the store up to some days before due date --Partial Payment with cash –Void
 	 			Given CA_PDL_066
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    		Then Void the transaction
			#Then History
  
  Scenario: Loan -- Advance =>Partial Payment with 2 tender types as CCK and MO =>Transaction should be processed => Void with original tender
 	 			Given CA_PDL_067
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    		Then Void the transaction  
    			#Then History	

   Scenario: Loan -- Advance =>Partial Payment with 2 tender types as CCK and MO =>Transaction should be processed => Void with Cash
 	 			Given CA_PDL_068
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    		Then Void the transaction 
			#Then History  
		 
		
		 	
  Scenario: Loan -- Advance =>Partial Payment with 2 tender types as CCK =>Transaction should be processed => Void with Original Tender
 	 			Given CA_PDL_069
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    		Then Void the transaction 
 				#Then History	 
  
  Scenario: Loan -- Advance =>Partial Payment with 2 tender types as CCK =>Transaction should be processed => Void with Cash
 	 			Given CA_PDL_070
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    		Then Void the transaction  
 				#Then History	 
  
  Scenario: Loan -- Advance =>Partial Payment with tender types as CK  =>Transaction should be processed => Void with original tender
 	 			Given CA_PDL_071
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    		Then Void the transaction   
			#Then History  		

Scenario: Loan -- Advance =>Partial Payment with tender types as CK  =>Transaction should be processed => Void with Cash
 	 			Given CA_PDL_072
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    		Then Void the transaction  	
    					#Then History		
 		

Scenario: Loan -- Advance =>Partial Payment with tender types as MO =>Transaction should be processed => Void with original tender
 	 			Given CA_PDL_073
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    		Then Void the transaction 	
    					#Then History
 		

Scenario: Loan -- Advance =>Partial Payment with tender types as MO =>Transaction should be processed => Void with Cash
 	 			Given CA_PDL_074
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Loan Date from History
    		Then Age the store to "5"
    		Then Partial Payment
    		Then Void the transaction   
    					#Then History	
 		

Scenario: Loan with ACH --> Safe deposit on Due date → Payoff amount should display in Safe deposit
 	 			Given CA_PDL_083
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Due Date from History
    		Then Age the store to "0"
    		Then Safe deposit on duedate
    					#Then History
 

Scenario: Loan with ACH --> Partial Payment --> Safe deposit on Due date → pending amount should display in Safe deposit
 	 			Given CA_PDL_084
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		Then Partial Payment
    		And Get the Due Date from History
    		Then Age the store to "0"
    		Then Safe deposit on duedate 
    					#Then History 


Scenario:Loan Loan with ACH --> Check edit from admin → Should display as Manual in Safe deposit on Due date
 	 			Given CA_PDL_085
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Due Date from History
    		Then Check edit from admin
    		And Get the Due Date from History
    		Then Age the store to "0"
    		Then Safe deposit on duedate   
    					#Then History 

@current
Scenario:Loan Loan with ACH → mark Revoke from admin → Process Safe deposit on Due date
 	 			Given CA_PDL_087
    		#And Login into CSR
    		#Given Registration of the Borrower PDL
    		#Then New Loan taken for the user
    		#And Get the Due Date from History
    		Then Revoke from admin
    		And Get the Due Date from History
    		Then Age the store to "0"
    		Then Safe deposit on duedate   
    					#Then History 
  

Scenario: Loan with RCPO --> Safe deposit on Due date → Payoff amount should display in Safe deposit
 	 			Given CA_PDL_088
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Due Date from History
    		Then Age the store to "0"
    		Then Safe deposit on duedate 
    					#Then History
  	 

Scenario: Loan with RCPO --> Partial Payment --> Safe deposit on Due date → pending amount should display in Safe deposit
 	 			Given CA_PDL_089
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		Then Partial Payment
    		And Get the Due Date from History
    		Then Age the store to "0"
    		Then Safe deposit on duedate  
    					#Then History


Scenario:Loan Loan with RCPO --> Check edit from admin → Should display as Manual in Safe deposit on Due date
 	 			Given CA_PDL_090
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Due Date from History
    		Then Check edit from admin
    		And Get the Due Date from History
    		Then Age the store to "0"
    		Then Safe deposit on duedate  
    					#Then History  


Scenario:Loan Loan with RCPO → mark Revoke from admin → Process Safe deposit on Due date
 	 			Given CA_PDL_092
    		And Login into CSR
    		Given Registration of the Borrower PDL
    		Then New Loan taken for the user
    		And Get the Due Date from History
    		Then Revoke from admin
    		And Get the Due Date from History
    		Then Age the store to "0"
    		Then Safe deposit on duedate  
    		#Then History   				