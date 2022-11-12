package ass_2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class Registration extends javax.swing.JFrame {

	public Registration() {
        initComponents();
    }
	// method declare
    private void initComponents() {
// adding all the java swing elements
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        textFieldDate = new javax.swing.JTextField();
        textFieldCity = new javax.swing.JTextField();
        textFieldPfizer = new javax.swing.JTextField();
        textFieldModerna = new javax.swing.JTextField();
        textFieldAstraZeneca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Registration");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Date of Vaccination: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name of City: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Number of Pfizer Vaccine Doses Administered:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Number of Moderna Vaccine Doses Administered: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Number of AstraZeneca Vaccine Doses Administered: ");
// adding action listener
        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        textFieldDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldDate.setText(" ");

        textFieldCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldCity.setText("\n");

        textFieldPfizer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldPfizer.setText("0");
        textFieldPfizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPfizerActionPerformed(evt);
            }
        });

        textFieldModerna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldModerna.setText("0");

        textFieldAstraZeneca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textFieldAstraZeneca.setText("0");

// setting layouts
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldDate)
                    .addComponent(textFieldCity)
                    .addComponent(textFieldPfizer, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(textFieldModerna)
                    .addComponent(textFieldAstraZeneca))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldPfizer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldModerna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textFieldAstraZeneca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(submitButton))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>                        

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        setVisible(false);
        new Main().setVisible(true);
    }                                          

    private void textFieldPfizerActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
   // making function for registring data     
       RegisterData();
       
    }                                            
public void RegisterData()  {
		
		String date = textFieldDate.getText().toString().trim();
        
        String city = textFieldCity.getText().toString();
        boolean vac=true;

        //Checking that the input format of date matches mm/dd/yyyy
        System.out.println(date);
        boolean isValidFormat = date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"); boolean check = true; 
        System.out.println(isValidFormat);
        if(isValidFormat!=true){
        
            JOptionPane.showMessageDialog(rootPane, "The date format is not in mm/dd/yyyy format","Alert", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            String[] InputDate = new String[3];
            InputDate = date.split("/");
            int month = Integer.parseInt(InputDate[0]);
            int day = Integer.parseInt(InputDate[1]);
            int year = Integer.parseInt(InputDate[2]);
            System.out.println(month);
            System.out.println(day);
            System.out.println(year);
            if(month<1 || month>12){
                check=false;
            }

            if(month%2 == 0){
                if(day<1 || day>30){
                    check = false;
                }
            }
            else{
                if(day<1 || day>31){
                    check = false;
                }
            }
        }

        if(!check){
            JOptionPane.showMessageDialog(rootPane, "The date format is not in corret  mm/dd/yyyy format","Alert", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String pfizer= textFieldPfizer.getText();
        int pfizerInt=0;
        if(pfizer!=null){
            try {
                pfizerInt = Integer.parseInt(pfizer);
            } catch (NumberFormatException e) {
                vac=false;
                JOptionPane.showMessageDialog(rootPane, "Format is not correct","Alert", JOptionPane.WARNING_MESSAGE);
            }
        }




        String moderna=textFieldModerna.getText();
        int modernaInt=0;
        if(moderna!=null){
            try {
                modernaInt = Integer.parseInt(moderna);
            } catch (NumberFormatException e) {
                vac=false;
                JOptionPane.showMessageDialog(rootPane, "Format is not correct","Alert", JOptionPane.WARNING_MESSAGE);
            }
        }



       String astra=  textFieldAstraZeneca.getText();
        int astraInt=0;
        if(astra!=null){
            try {
                astraInt = Integer.parseInt(astra);
            } catch (NumberFormatException e) {
                vac=false;
                JOptionPane.showMessageDialog(rootPane, "Format is not correct","Alert", JOptionPane.WARNING_MESSAGE);
            }
        }



       //Checking if the date or city is blank and vaccines are numbers
        if(date==null || city== null || date.isBlank()|| date.equals("") || city.isBlank()|| city.equals("") || !vac)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter All Fields","Alert", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int pfizer1 = Integer.parseInt(textFieldPfizer.getText());
            int moderna1 = Integer.parseInt(textFieldModerna.getText().toString());
            int astra1 = Integer.parseInt(textFieldModerna.getText().toString());
            
            File file = new File("Report.txt");
			try {
				//Writing all the above fields into the Report.txt file
				FileWriter fileWriter = new FileWriter(file,true);
				fileWriter.write(date+","+city+","+pfizer1+","+moderna1+","+ astra1+"\n");
				fileWriter.close();
			}

			catch (IOException e){
				//This function will trace to the location of the error in our program.
				e.printStackTrace();

			}
            
            JOptionPane.showMessageDialog(rootPane, "Success");
            
            textFieldDate.setText("");
            textFieldCity.setText("");
            textFieldPfizer.setText("0");
            textFieldModerna.setText("0");
            textFieldAstraZeneca.setText("0");
            
        }

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField textFieldAstraZeneca;
    private javax.swing.JTextField textFieldCity;
    private javax.swing.JTextField textFieldDate;
    private javax.swing.JTextField textFieldModerna;
    private javax.swing.JTextField textFieldPfizer;
    // End of variables declaration                   
}

      