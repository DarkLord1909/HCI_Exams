/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Jan 10, 2014, 2:20:07 PM
 */


import java.io.FileWriter;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author user
 */
public class GoogleEngage extends javax.swing.JFrame {

    /** Creates new form Login */
    public GoogleEngage() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGSecurity = new javax.swing.ButtonGroup();
        jHiddenTextArea = new javax.swing.JTextArea();
        jOptionPane = new javax.swing.JOptionPane();
        jSaveChooser = new javax.swing.JFileChooser();
        jGoogleTermsDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jCBAccept = new javax.swing.JCheckBox();
        jBAccountCreated = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCreateAccountDialog = new javax.swing.JDialog();
        jPanelNewAccount = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRBGame = new javax.swing.JRadioButton();
        jRBTeam = new javax.swing.JRadioButton();
        jRBPhone = new javax.swing.JRadioButton();
        jTFName = new javax.swing.JTextField();
        jTFSurname = new javax.swing.JTextField();
        jTFUsername = new javax.swing.JTextField();
        jPFPassword = new javax.swing.JPasswordField();
        jPFCheckPass = new javax.swing.JPasswordField();
        jTFSecurityQuest = new javax.swing.JTextField();
        jBSubmit = new javax.swing.JButton();
        jPanelLogIn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        loggedUser = new javax.swing.JTextField();
        loggedPass = new javax.swing.JPasswordField();
        jBConnect = new javax.swing.JButton();
        jBCreateAccount = new javax.swing.JButton();

        jHiddenTextArea.setColumns(20);
        jHiddenTextArea.setRows(5);

        jGoogleTermsDialog.setTitle("Όροι χρήσης");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Όροι της Google"));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Αποδέχεστε τους όρους της Google;");

        jCBAccept.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBAccept.setText("Αποδέχομαι");
        jCBAccept.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBAcceptItemStateChanged(evt);
            }
        });

        jBAccountCreated.setText("Τέλος");
        jBAccountCreated.setEnabled(false);
        jBAccountCreated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAccountCreatedActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setText("Όροι & Προϋποθέσεις\nΟΡΟΙ ΚΑΙ ΠΡΟΫΠΟΘΕΣΕΙΣ ΓΙΑ ΤΟ ΠΡΟΓΡΑΜΜΑ GOOGLE ENGAGE ΓΙΑ ΔΙΑΦΗΜΙΣΤΙΚΕΣ ΣΤΗΝ ΕΛΛΑΔΑ\n1. Η σχέση σας με την Google\n\n    Η χρήση από μέρους σας των υπηρεσιών που περιγράφονται παρακάτω υπόκεινται στην ακόλουθη νομική συμφωνία ανάμεσα σε εσάς και την Google. Ως \"Google\" νοείται η εταιρεία Google Inc., τα κεντρικά γραφεία της οποίας έχουν έδρα επί της οδού Amphitheatre Parkway 1600, Mountain View, CA94043, Ηνωμένες Πολιτείες.\n    Οι υπηρεσίες που παρέχονται από την Google είναι εκπαιδευτικές υπηρεσίες και υπηρεσίες παροχής κινήτρων, που συμπεριλαμβάνουν την πρόσβαση σε έναν ενημερωτικό ιστότοπο σχετικά με το Google AdWords και τα άλλα επιχειρηματικά προϊόντα της Google (εφεξής ο \"Ιστότοπος\"), πρόσβαση σε κουπόνια για χρήση στο πρόγραμμα Google AdWords (εφεξής τα \"Κουπόνια Google\"), σχετικές επικοινωνίες μέσω ηλεκτρονικού ταχυδρομείου, καθώς επίσης και άλλα οφέλη, όπως αποφασίζονται από την Google (εφεξής συλλογικά οι \"Υπηρεσίες Google\").\n    Η συμφωνία σας με την Google όσον αφορά τις Υπηρεσίες Google περιλαμβάνει τα εξής:\n        τους παρόντες όρους και προϋποθέσεις και\n        σχετιζόμενες με τις Υπηρεσίες Google πολιτικές και συχνές ερωτήσεις όπως έχουν αναρτηθεί στο διαδίκτυο ή έχουν διανεμηθεί μέσω ηλεκτρονικού ταχυδρομείου από την Google (εφεξής συλλογικά οι \"Όροι\"). Η πρόσβαση στις Υπηρεσίες Google παραχωρείται από την Google κατά την αποκλειστική διακριτική της ευχέρεια. Σε περίπτωση που σας παραχωρηθεί άδεια πρόσβασης, συμφωνείτε να χρησιμοποιείτε τις Υπηρεσίες Google μόνο προς όφελος της εταιρείας ή της επιχειρηματικής δραστηριότητας (συμπεριλαμβανομένης της δραστηριότητας ελεύθερου επαγγελματία) που προσδιορίζετε κατά την εγγραφή στις Υπηρεσίες Google (εφεξής η \"Επιχείρησή σας\").\n    Τα άτομα στα οποία έχουν επιβληθεί απαγόρευση εξόδου από την χώρα και άλλες κυρώσεις, δεν έχουν δικαίωμα συμμετοχής.\n    Θα θεωρηθεί ότι συμφωνείτε με τους Όρους: (i) αν κάνετε κλικ για αποδοχή των Όρων, ή (ii) αν χρησιμοποιήσετε τις Υπηρεσίες Google.\n\n2. Εγγραφή για τις Υπηρεσίες Google\n\n    Για να υποβάλετε αίτηση για την απόκτηση δικαιώματος πρόσβασης στις Υπηρεσίες Google, πρέπει να συμπληρώσετε όλες τις απαιτούμενες πληροφορίες στις ιστοσελίδες εγγραφής για τις Υπηρεσίες Google (εφεξής \"Πληροφορίες Εγγραφής\"). Κατανοείτε ότι όταν παρέχετε τις Πληροφορίες Εγγραφής, εγγράφεστε με το δικό σας όνομα ώστε να επιτρέψετε στην Επιχείρησή σας να επωφεληθεί από τις Υπηρεσίες Google, και όχι εσείς προσωπικά. Η Google μπορεί να σας παραχωρήσει πρόσβαση στον Ιστότοπο κατόπιν εξέτασης των Πληροφοριών Εγγραφής που έχετε παράσχει.\n    Πρέπει να παρέχετε τρέχουσες, ολοκληρωμένες και ακριβείς πληροφορίες κατά την διαδικασία εγγραφής και να τις διατηρείτε ενημερωμένες και ακριβείς κατά την διάρκεια χρήσεως των Υπηρεσιών Google. Ως προϋπόθεση για τη συνεχιζόμενη χρήση των Υπηρεσιών Google, η Google μπορεί να σας ζητήσει να παρέχετε πρόσθετες πληροφορίες ή να ικανοποιείτε άλλες απαιτήσεις για συμμετοχή (συμπεριλαμβανομένης της παρακολούθησης κάποιας εκδήλωσης). Συμφωνείτε να παρέχετε πληροφορίες που θα ζητήσει η Google, συμπεριλαμβανομένων πληροφοριών που είναι απαραίτητες για τον έλεγχο και την επιβεβαίωση της ταυτότητάς σας.\n    Η Google έχει την απόλυτη διακριτική ευχέρεια να παραχωρεί και να ακυρώνει την πρόσβαση στις Υπηρεσίες Google (ή σε οποιαδήποτε υπηρεσία μεμονωμένα).\n\n3. Παροχή των Υπηρεσιών Google από την Google\n\n    Η Google διαθέτει θυγατρικές και συγγενείς εταιρείες σε όλο τον κόσμο (εφεξής οι \"Θυγατρικές\" και\"Συγγενείς Εταιρείες\"). Σε ορισμένες περιπτώσεις, αυτές οι εταιρείες θα παρέχουν μέρος ή όλες τις Υπηρεσίες Google σε εσάς εκ μέρους της Google και είναι τρίτοι επωφελούμενοι αυτών των Όρων. Εκτός των εν λόγω Θυγατρικών ή Συγγενών Εταιρειών, δεν υπάρχουν άλλοι τρίτοι επωφελούμενοι των Όρων.\n\n4. Χρήση των δεδομένων σας\n\n    Η Google θα χρησιμοποιήσει τις πληροφορίες σας (συμπεριλαμβανομένων των Πληροφοριών Εγγραφής) μόνο σύμφωνα με την πολιτική απορρήτου της Google που διατίθεται στον ιστότοποwww.google.com/privacy.html. Συμφωνείτε στην χρήση των δεδομένων σας σύμφωνα με τις πολιτικές απορρήτου της Google.\n\n5. Χρήση των Υπηρεσιών Google από μέρους σας\n\n    Με τη χρήση των Υπηρεσιών Google, συμφωνείτε (i) να χρησιμοποιείτε τις Υπηρεσίες Google μόνο για τους σκοπούς που επιτρέπονται από τους Όρους και (ii) να συμμορφώνεστε με όλους τους ισχύοντες νόμους, συμπεριλαμβανομένου ενδεικτικά του Νόμου των ΗΠΑ περί πρακτικών διαφθοράς στο εξωτερικό, ο οποίος απαγορεύει την δωροδοκία με οποιοδήποτε είδος αξίας, άμεσα ή έμμεσα, σε κυβερνητικό αξιωματούχο με σκοπό την εξασφάλιση επιχειρηματικής δραστηριότητας. Ο όρος \"κυβερνητικοί αξιωματούχοι\" περιλαμβάνει οποιονδήποτε εργαζόμενο στο δημόσιο, υποψήφιο για δημόσιο αξίωμα και εργαζόμενο σε εταιρείες που ανήκουν ή ελέγχονται από το κράτος, δημόσιους διεθνείς οργανισμούς και πολιτικά κόμματα.\n    Συμφωνείτε ότι δεν θα εμπλακείτε σε οποιαδήποτε δραστηριότητα που κωλύει ή διακόπτει την παροχή των Υπηρεσιών Google (ή τους διακομιστές και τα δίκτυα που συνδέονται με τις Υπηρεσίες Google). Συμφωνείτε να μην προβαίνετε σε αναπαραγωγή, δημιουργία αντιτύπων, αντιγραφή, πώληση, εμπόριο ή μεταπώληση των Υπηρεσιών Google (συμπεριλαμβανομένων των Κουπονιών Google) για κανένα σκοπό, εκτός αν διαθέτετε σχετική ειδική άδεια βάσει ειδικού συμφωνητικού με την Google.\n    Αν δημιουργήσετε λογαριασμούς AdWords για τρίτους διαφημιζόμενους ενώ συμμετέχετε στις Υπηρεσίες Google, (i) ο λογαριασμός αυτός θα διέπεται από τους όρους και τις προϋποθέσεις για το πρόγραμμα AdWords (www.google.com/ads/terms) και (ii) συμφωνείτε να παρέχετε στο διαφημιζόμενο δεδομένα αναφοράς που γνωστοποιούν (α) το ποσό που δαπανάτε για λογαριασμό του στο Google AdWords, και (β)τον αριθμό των εμφανίσεων και των κλικ για τις διαφημίσεις του εν λόγω διαφημιζόμενου που εμφανίζονται στο δίκτυοGoogle.\n    Συμφωνείτε ότι είστε αποκλειστικά υπεύθυνοι (και ότι ηGoogleδεν φέρει καμία ευθύνη έναντι υμών ή οποιουδήποτε τρίτου μέρους) για την όποια παραβίαση των υποχρεώσεών σας βάσει των Όρων, καθώς και για τις συνέπειες που απορρέουν από τέτοια παραβίαση (συμπεριλαμβανομένης της όποιας απώλειας ή ζημίας την οποία ενδέχεται να υποστεί η Google).\n");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAccountCreated)
                            .addComponent(jCBAccept)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBAccept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAccountCreated)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jGoogleTermsDialogLayout = new javax.swing.GroupLayout(jGoogleTermsDialog.getContentPane());
        jGoogleTermsDialog.getContentPane().setLayout(jGoogleTermsDialogLayout);
        jGoogleTermsDialogLayout.setHorizontalGroup(
            jGoogleTermsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jGoogleTermsDialogLayout.setVerticalGroup(
            jGoogleTermsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jCreateAccountDialog.setTitle("Νέος Λογαριασμός");

        jPanelNewAccount.setBackground(new java.awt.Color(204, 204, 255));
        jPanelNewAccount.setBorder(javax.swing.BorderFactory.createTitledBorder("Δημιουργία του Λογαριασμού σας Google"));
        jPanelNewAccount.setFocusCycleRoot(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Όνομα:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Επώνυμο:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Όνομα Σύνδεσης:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Κωδικός Πρόσβασης:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Επιβεβαίωση Κωδικού Πρόσβασης:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("Ερώτηση Ασφαλείας");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Απάντηση Στην Ερώτηση Ασφαλείας:");

        bGSecurity.add(jRBGame);
        jRBGame.setSelected(true);
        jRBGame.setText("Ποιό είναι το όνομα του αγαπημένου σας παιχνιδιού;");

        bGSecurity.add(jRBTeam);
        jRBTeam.setText("Ποιό είναι το όνομα της ομάδας σας;");

        bGSecurity.add(jRBPhone);
        jRBPhone.setText("Ποιός ήταν ο πρώτος αριθμός κινητού τηλεφώνου που είχατε;");

        jPFPassword.setToolTipText("Χρησιμοποιήστε τουλάχιστον 8 χαρακτήρες");

        jBSubmit.setText("Επόμενο βήμα");
        jBSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNewAccountLayout = new javax.swing.GroupLayout(jPanelNewAccount);
        jPanelNewAccount.setLayout(jPanelNewAccountLayout);
        jPanelNewAccountLayout.setHorizontalGroup(
            jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNewAccountLayout.createSequentialGroup()
                        .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPFCheckPass)
                            .addComponent(jTFSurname)
                            .addComponent(jTFName)
                            .addComponent(jTFUsername)
                            .addComponent(jPFPassword)))
                    .addGroup(jPanelNewAccountLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTFSecurityQuest))
                    .addGroup(jPanelNewAccountLayout.createSequentialGroup()
                        .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBPhone)
                            .addComponent(jRBTeam)
                            .addComponent(jRBGame)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSubmit))
                        .addGap(0, 227, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelNewAccountLayout.setVerticalGroup(
            jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFCheckPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBTeam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBPhone)
                .addGap(18, 18, 18)
                .addGroup(jPanelNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFSecurityQuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jCreateAccountDialogLayout = new javax.swing.GroupLayout(jCreateAccountDialog.getContentPane());
        jCreateAccountDialog.getContentPane().setLayout(jCreateAccountDialogLayout);
        jCreateAccountDialogLayout.setHorizontalGroup(
            jCreateAccountDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jCreateAccountDialogLayout.setVerticalGroup(
            jCreateAccountDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelNewAccount.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Λογαριασμοί Google");

        jPanelLogIn.setBackground(new java.awt.Color(204, 255, 204));
        jPanelLogIn.setBorder(javax.swing.BorderFactory.createTitledBorder("Συνδεθείτε για να συνεχίσετε στο Google Engage"));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Όνομα Σύνδεσης:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avatar_2x.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Κωδικός Πρόσβασης:");

        jBConnect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBConnect.setText("Σύνδεση");
        jBConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogInLayout = new javax.swing.GroupLayout(jPanelLogIn);
        jPanelLogIn.setLayout(jPanelLogInLayout);
        jPanelLogInLayout.setHorizontalGroup(
            jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogInLayout.createSequentialGroup()
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBConnect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLogInLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loggedUser))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLogInLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loggedPass, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanelLogInLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLogInLayout.setVerticalGroup(
            jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogInLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(loggedUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loggedPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jBConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jBCreateAccount.setText("Δημιουργία λογαριασμού");
        jBCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCreateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBCreateAccount))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCreateAccount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jBSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubmitActionPerformed
    //elegxos kenon pedion
    if(jTFName.getText().equals("") || jTFSurname.getText().equals("") || 
            jTFUsername.getText().equals("") || jPFPassword.getText().equals("") 
            || jPFCheckPass.getText().equals("") || jTFSecurityQuest.getText().equals("")) {
        
            myerrormessage("Πρέπει να συμπληρώσετε όλα τα πεδία.");
            return;
    }
    
    password = jPFPassword.getText();
    String confirm = jPFCheckPass.getText();
    username = jTFUsername.getText();
    boolean found = false;
    
    if (password.length() < 8) {
        myerrormessage("Ο κωδικός πρόσβασης πρέπει να είναι μεγαλύτερος από 8 χαρακτήρες.");
        return;
    }
    
    if (!password.equals(confirm)) {
        myerrormessage("Λάθος επιβεβαίωση κωδικού. Παρακαλώ, ξαναπροσπαθήστε.");
        return;
    }
    
    for (int i = 0; i < y; i++) {
        if (userDatabase[i].equals(username)) {
            found = true;
            break;
        }
    }
   
    if (found) {
        myerrormessage("O χρήστης υπάρχει ήδη. Επιλέξτε διαφορετικό όνομα σύνδεσης");
        return;
    }
    
    String info = "Στοιχεία χρήστη \n" +
                "------------------------------------------------------------------------- \n" +
                "Όνομα                          : " + jTFName.getText() + "\n" +
                "Επώνυμο                        : " + jTFSurname.getText() + "\n" +
                "Όνομα Σύνδεσης                 : " + jTFUsername.getText() + "\n" +
                "Κωδικός Πρόσβασης              : " + jPFPassword.getText() + "\n";
    
    if (jRBGame.isSelected()) 
        info += "Ερώτηση Ασφαλείας: Ποιό είναι το όνομα του αγαπημένου σας παιχνιδιού; \n";
    else if (jRBTeam.isSelected()) 
        info += "Ερώτηση Ασφαλείας: Ποιό είναι το όνομα της ομάδας σας; \n";
    else if (jRBPhone.isSelected())
        info += "Ερώτηση Ασφαλείας: Ποιός ήταν ο πρώτος αριθμός κινητού τηλεφώνου που είχατε; \n";
    
    info += "Aπάντηση Στην Ερώτηση Ασφαλέιας: " + jTFSecurityQuest.getText() + "\n";
    
    jHiddenTextArea.append(info);
    
    jGoogleTermsDialog.setVisible(true);
    jGoogleTermsDialog.setSize(557,475);
}//GEN-LAST:event_jBSubmitActionPerformed

private void jCBAcceptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBAcceptItemStateChanged
    if (jCBAccept.isSelected()) jBAccountCreated.setEnabled(true);
    else jBAccountCreated.setEnabled(false);
}//GEN-LAST:event_jCBAcceptItemStateChanged

private void jBAccountCreatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAccountCreatedActionPerformed
    myinfomessage("Επιλέξτε το όνομα και τον προορισμό του αρχείο με τις λεπτομέρειες του λογαριασμού σας");
    
    FileWriter fw;
    FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT files", "txt");
    jSaveChooser.setFileFilter(filter);
    int returnVal = jSaveChooser.showSaveDialog(null);
        if (returnVal == jSaveChooser.APPROVE_OPTION) {
            String fname = jSaveChooser.getSelectedFile().getName();
            String filepath = String.valueOf(jSaveChooser.getCurrentDirectory());
            fname = filepath + "\\" + fname;
            try {
                fw = new FileWriter(fname);
                jHiddenTextArea.write(fw);
                fw.close();
            }
            catch (IOException exc) {
                myerrormessage("ERROR...");
                jHiddenTextArea.setText("");
                jGoogleTermsDialog.setVisible(true);
                return;
            }
            
        }
        
        else {
            myinfomessage("Η εγγραφή σας ακυρώθηκε");
            jHiddenTextArea.setText("");
            jGoogleTermsDialog.setVisible(false);
            return;
        }
        
        userDatabase[y] = username;
        passDatabase[y] = password;
        username = password = "";
        y++;
        jHiddenTextArea.setText("");
        myinfomessage("Η εγγραφή σας έχει ολοκληρωθεί");
        
        //katharismos pedion
        jTFName.setText("");
        jTFSurname.setText("");
        jTFUsername.setText("");
        jPFPassword.setText(""); 
        jPFCheckPass.setText("");
        jTFSecurityQuest.setText("");
        jCBAccept.setEnabled(false);
                
        jGoogleTermsDialog.setVisible(false);
        jCreateAccountDialog.setVisible(false);
}//GEN-LAST:event_jBAccountCreatedActionPerformed

private void jBConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConnectActionPerformed
    boolean found = false;
    for (int i = 0; i < y; i++) {
        if (userDatabase[i].equals(loggedUser.getText()) && passDatabase[i].equals(loggedPass.getText())) {
            found = true;
            break;
        }
    }
   
    if (found) {
        myinfomessage("Επιτυχής σύνδεση");
        loggedUser.setText("");
        loggedPass.setText("");
    }
    else myerrormessage("Λάθος όνομα και κωδικός πρόσβασης");
}//GEN-LAST:event_jBConnectActionPerformed

    private void jBCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCreateAccountActionPerformed
        jCreateAccountDialog.setVisible(true);
        jCreateAccountDialog.setSize(650,455);
    }//GEN-LAST:event_jBCreateAccountActionPerformed

void myerrormessage (String message) {
    jOptionPane.showMessageDialog(null, message, "Σφάλμα", jOptionPane.ERROR_MESSAGE);
}

void myinfomessage (String message) {
    jOptionPane.showMessageDialog(null, message, "Ενημέρωση", jOptionPane.INFORMATION_MESSAGE);
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GoogleEngage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoogleEngage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoogleEngage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoogleEngage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GoogleEngage().setVisible(true);
            }
        });
    }
    
    int y = 0;
    String username;
    String password;
    String userDatabase[] = new String[50];
    String passDatabase[] = new String[50];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGSecurity;
    private javax.swing.JButton jBAccountCreated;
    private javax.swing.JButton jBConnect;
    private javax.swing.JButton jBCreateAccount;
    private javax.swing.JButton jBSubmit;
    private javax.swing.JCheckBox jCBAccept;
    private javax.swing.JDialog jCreateAccountDialog;
    private javax.swing.JDialog jGoogleTermsDialog;
    private javax.swing.JTextArea jHiddenTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane;
    private javax.swing.JPasswordField jPFCheckPass;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLogIn;
    private javax.swing.JPanel jPanelNewAccount;
    private javax.swing.JRadioButton jRBGame;
    private javax.swing.JRadioButton jRBPhone;
    private javax.swing.JRadioButton jRBTeam;
    private javax.swing.JFileChooser jSaveChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFName;
    private javax.swing.JTextField jTFSecurityQuest;
    private javax.swing.JTextField jTFSurname;
    private javax.swing.JTextField jTFUsername;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField loggedPass;
    private javax.swing.JTextField loggedUser;
    // End of variables declaration//GEN-END:variables
}
