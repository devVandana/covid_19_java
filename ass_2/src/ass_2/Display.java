package ass_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import javax.swing.JOptionPane;


public class Display extends javax.swing.JFrame {

	 public Display() {
		 initComponents();
	    }
// method declaration 
		 private void initComponents() {
// making Label, Buttons and Panel 
			 // Setting setting font 
			 //ActionLister for required field
		        jLabel1 = new javax.swing.JLabel();
		        backButton = new javax.swing.JButton();
		        jLabel2 = new javax.swing.JLabel();
		        jLabel3 = new javax.swing.JLabel();
		        jLabel4 = new javax.swing.JLabel();
		        dateAndNameTextField = new javax.swing.JTextField();
		        dateTextField = new javax.swing.JTextField();
		        cityTextField = new javax.swing.JTextField();
		       
		        jLabel6 = new javax.swing.JLabel();
		        jLabel7 = new javax.swing.JLabel();
		        jLabel9 = new javax.swing.JLabel();
		        jScrollPane1 = new javax.swing.JScrollPane();
		        textArea = new javax.swing.JTextArea();
		        submitButton = new javax.swing.JButton();
    		      
		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
		        jLabel1.setText("Display the Record of Vaccination By");

		        backButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		        backButton.setText("Back");
		        backButton.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                backButtonActionPerformed(evt);
		            }
		        });

		        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		        jLabel2.setText("Date and Name of City: ");

		        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		        jLabel3.setText("Date: ");

		        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		        jLabel4.setText("City");
		        
		        

		        dateAndNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		        dateAndNameTextField.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                dateAndNameTextFieldActionPerformed(evt);
		            }
		        });

		        dateTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		        cityTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

		        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel6.setText("(OR)");

		        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel7.setText("(OR)");

		        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel9.setText("(Separate it By Space)");

		        textArea.setColumns(20);
		        textArea.setRows(5);
		        jScrollPane1.setViewportView(textArea);

		        submitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		        submitButton.setText("Submit");
		        submitButton.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                submitButtonActionPerformed(evt);
		            }
		        });
		        
		       // layout setting and aading the elements
		        
		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        getContentPane().setLayout(layout);
		        layout.setHorizontalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                .addGap(0, 0, Short.MAX_VALUE)
		                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(120, 120, 120))
		            .addGroup(layout.createSequentialGroup()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(47, 47, 47)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addGroup(layout.createSequentialGroup()
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(jLabel3)
		                                    .addComponent(jLabel4)
		                                    .addGroup(layout.createSequentialGroup()
		                                        .addComponent(jLabel2)
		                                        .addGap(30, 30, 30)
		                                        .addComponent(jLabel9)))
		                                .addGap(71, 71, 71)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(dateAndNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(131, 131, 131)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel7)
		                            .addComponent(jLabel6))))
		                .addContainerGap(50, Short.MAX_VALUE))
		        );
		        layout.setVerticalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addContainerGap()
		                .addComponent(jLabel1)
		                .addGap(39, 39, 39)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jLabel2)
		                    .addComponent(dateAndNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel9))
		                .addGap(18, 18, 18)
		                .addComponent(jLabel6)
		                .addGap(27, 27, 27)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jLabel3)
		                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(20, 20, 20)
		                .addComponent(jLabel7)
		                .addGap(29, 29, 29)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jLabel4)
		                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(43, 43, 43)
		                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
		                .addGap(27, 27, 27)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(submitButton)
		                    .addComponent(backButton))
		                .addGap(86, 86, 86))
		        );

		    }// </editor-fold>                        

		    private void dateAndNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                     
		        // TODO add your handling code here:
		    }                                                    

		    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
		        
		       // making search method 
		        SearchData();
		    }               
		    public void SearchData () {
		        String dateAndCity = dateAndNameTextField.getText().toString();
		        String date = dateTextField.getText().toString();
		        String city = " "+cityTextField.getText().toString();
		        boolean flag=false;
		        String ansString="";
		        if(!dateAndCity.equals(""))
		        {
		            System.out.println("gkdn");
		            String[] dateCity = dateAndCity.split(" ");
		           
                   // System.out.println(cityString+dateString);
		            if(dateCity.length!=2)
		            {
		                JOptionPane.showMessageDialog(rootPane, "Enter the Details Properly!!","Alert",JOptionPane.WARNING_MESSAGE);
		            }
		            else
		            {
		                File file = new File("Report.txt");
		                File results = new File("SearchResults.txt");
		                try {
		                    //Using scanner class to read from the report.txt file.
		                    Scanner scanner = new Scanner(file);
		                    System.out.println("Searching...");
		                    
		                    while(scanner.hasNextLine()){ 
		                    	//using hasNextLine to read the text file line by line
		                    	 String dateString = dateCity[0];
		                         String cityString = " "+dateCity[1];
		                         
		                    	System.out.println("hello");
		                        String line = scanner.nextLine();
		                        String[] values = line.split(",");
		                        int totalVaccines=0;
		                        String cityName = "";
		                        String cityDate = "";
		                        int pfizer=0;
		                        int moderna=0;
		                        int astra=0;
		                        if(values[0].equals(dateString)){
		                        	System.out.println("hell000");
		                        	System.out.println(dateString+values[0]+cityString+values[1]);
		                            if(values[1].equals(cityString)){
		                                System.out.println("hell");
		                            	
		                                cityDate=values[0];
		                                cityName+= values[1];
		                                pfizer+=Integer.parseInt(values[2]);
		                                moderna+=Integer.parseInt(values[3]);
		                                astra+=Integer.parseInt(values[4]);
		                                 totalVaccines=pfizer+astra+moderna;
		                                 System.out.println(cityDate+cityName+totalVaccines+pfizer+astra+moderna);
		                                ansString+="\nDate: "+cityDate;
		                                ansString+="\nName of city: "+cityName;
		                                ansString+="\nNumber of Pfizer vaccine doses administered: "+pfizer;
		                                ansString+="\nNumber of Moderna vaccine doses administered: "+moderna;
		                                ansString+="\nNumber of AstraZeneca vaccine doses administered: "+astra;
		                                ansString+="\nTotal Vaccines: "+totalVaccines;
		                                ansString+="\n********************************************";
		                                flag = true;
		                            }
		                            System.out.println("ansString");
		                            FileWriter fileWriter = new FileWriter(results,true);   //Writing the search results into SearchResults.txt file using Filewriter class object
		                            fileWriter.write(line+"\n");
		                            fileWriter.close();
		                            textArea.setText(ansString);
		                            dateAndNameTextField.setText("");
		                            dateTextField.setText("");
		                            cityTextField.setText("");
		                        }
		                    }
		                    scanner.close();
		                }
		                catch (IOException e){      //Checking for Input Output Exceptions
		                    System.out.println(e);
		                }
		            }
		            } else if(!date.equals(""))
		            {   
		                File file = new File("Report.txt");
		                File results = new File("SearchResults.txt");
		                try {
		                    //Using scanner class to read from the report.txt file.
		                    Scanner scanner = new Scanner(file);
		                    System.out.println("Searching...");
		                    while(scanner.hasNextLine()){       //using hasNextLine to read the text file line by line
		                        String line = scanner.nextLine();
		                        String[] values = line.split(",");
		                        int totalVaccines=0;
		                        String cityName = "";
		                        String cityDate = "";
		                        int pfizer=0;
		                        int moderna=0;
		                        int astra=0;
		                            if(values[0].equals(date)){
		                                cityDate=values[0];
		                                cityName+= values[1];
		                                pfizer+=Integer.parseInt(values[2]);
		                                moderna+=Integer.parseInt(values[3]);
		                                astra+=Integer.parseInt(values[4]);
		                                 totalVaccines=pfizer+astra+moderna;
		                                ansString+="\nDate: "+cityDate;
		                                //ansString+="\nName of city: "+cityName;
		                                ansString+="\nNumber of Pfizer vaccine doses administered: "+pfizer;
		                                ansString+="\nNumber of Moderna vaccine doses administered: "+moderna;
		                                ansString+="\nNumber of AstraZeneca vaccine doses administered: "+astra;
		                                ansString+="\nTotal Vaccines: "+totalVaccines;
		                                ansString+="\n********************************************";
		                                flag = true;
		                            FileWriter fileWriter = new FileWriter(results,true);   //Writing the search results into SearchResults.txt file using Filewriter class object
		                            fileWriter.write(line+"\n");
		                            fileWriter.close();
		                            textArea.setText(ansString);
		                            dateAndNameTextField.setText("");
		                            dateTextField.setText("");
		                            cityTextField.setText("");
		                        }
		                    }
		                    scanner.close();
		                }
		                catch (IOException e){      //Checking for Input Output Exceptions
		                    System.out.println(e);
		                }
		                textArea.setText(ansString);
		                dateAndNameTextField.setText("");
		                dateTextField.setText("");
		                cityTextField.setText("");
		            }else if(!city.equals(""))
		            {   
		                File file = new File("Report.txt");
		                File results = new File("SearchResults.txt");
		                try {
		                    //Using scanner class to read from the report.txt file.
		                    Scanner scanner = new Scanner(file);
		                    System.out.println("Searching...");
		                    while(scanner.hasNextLine()){       
		                    	//using hasNextLine to read the text file line by line
		                    	 System.out.println("hello");
		                        String line = scanner.nextLine();
		                        String[] values = line.split(",");
		                        int totalVaccines=0;
		                        String cityName = "";
		                        String cityDate = "";
		                        int pfizer=0;
		                        int moderna=0;
		                        int astra=0;
		                        System.out.println(values[1]+values[2]+values[3]+values[4]);
		                            if(values[1].equals(city)){
		                                cityDate=values[0];
		                                cityName= values[1];
		                                pfizer=Integer.parseInt(values[2]);
		                                moderna=Integer.parseInt(values[3]);
		                                astra=Integer.parseInt(values[4]);
		                                 totalVaccines=pfizer+astra+moderna;
		                                
		                                //ansString+="\nDate: "+cityDate;
		                                ansString+="\nName of city: "+cityName;
		                                ansString+="\nNumber of Pfizer vaccine doses administered: "+pfizer;
		                                ansString+="\nNumber of Moderna vaccine doses administered: "+moderna;
		                                ansString+="\nNumber of AstraZeneca vaccine doses administered: "+astra;
		                                ansString+="\nTotal Vaccines: "+totalVaccines;
		                                ansString+="\n********************************************";
		                                flag = true;
		                            FileWriter fileWriter = new FileWriter(results,true);   //Writing the search results into SearchResults.txt file using Filewriter class object
		                            fileWriter.write(line+"\n");
		                            fileWriter.close();
		                            textArea.setText(ansString);
		                            dateAndNameTextField.setText("");
		                            dateTextField.setText("");
		                            cityTextField.setText("");
		                        }
		                    }
		                    scanner.close();
		                }
		                catch (IOException e){      //Checking for Input Output Exceptions
		                    System.out.println(e);
		                }
		                textArea.setText(ansString);
		                dateAndNameTextField.setText("");
		                dateTextField.setText("");
		                cityTextField.setText("");
		            }
		        if(textArea.getText().equals("") && !flag)
		        {
		            JOptionPane.showMessageDialog(rootPane, "Enter Details or No Record Found!!");
		            dateAndNameTextField.setText("");
		            dateTextField.setText("");
		            cityTextField.setText("");
		        }
		    }
		

		    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
		        setVisible(false);
		        new Main().setVisible(true);
		    }                                          

		    /**
		     * @param args the command line arguments
		     */
		    public static void main(String args[]) {
		        /* Set the Nimbus look and feel */
		        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		         */
		        }
		    

		    // Variables declaration - do not modify                     
		    private javax.swing.JButton backButton;
		    private javax.swing.JTextField cityTextField;
		    private javax.swing.JTextField dateAndNameTextField;
		    private javax.swing.JTextField dateTextField;
		    private javax.swing.JLabel jLabel1;
		    private javax.swing.JLabel jLabel2;
		    private javax.swing.JLabel jLabel3;
		    private javax.swing.JLabel jLabel4;
		    private javax.swing.JLabel jLabel6;
		    private javax.swing.JLabel jLabel7;
		    private javax.swing.JLabel jLabel9;
		    private javax.swing.JScrollPane jScrollPane1;
		    private javax.swing.JButton submitButton;
		    private javax.swing.JTextArea textArea;
		    // End of variables declaration                   
		

	 }

