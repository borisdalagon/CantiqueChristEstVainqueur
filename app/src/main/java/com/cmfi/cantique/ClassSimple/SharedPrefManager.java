package com.cmfi.cantique.ClassSimple;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

/*

SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
Editor editor = pref.edit();

****Storing Data****
editor.commit() is used in order to save changes to shared preferences.


editor.putBoolean("key_name", true); // Storing boolean - true/false
editor.putString("key_name", "string value"); // Storing string
editor.putInt("key_name", "int value"); // Storing integer
editor.putFloat("key_name", "float value"); // Storing float
editor.putLong("key_name", "long value"); // Storing long

editor.commit(); // commit changes


***Retrieving Data***
Data can be retrieved from saved preferences by calling getString() as follows:


pref.getString("key_name", null); // getting String
pref.getInt("key_name", -1); // getting Integer
pref.getFloat("key_name", null); // getting Float
pref.getLong("key_name", null); // getting Long
pref.getBoolean("key_name", null); // getting boolean


***Clearing or Deleting Data***
remove(“key_name”) is used to delete that particular value.

clear() is used to remove all data


editor.remove("name"); // will delete key name
editor.remove("email"); // will delete key email

editor.commit(); // commit changes

editor.clear();
editor.commit(); // commit changes

*/


public class SharedPrefManager {

    //the constants
    private static final String SHARED_PREF_NAME = "EUMM";
    private static final String KEY_TOKEN = "token";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    //share preferences INFOS_MEMBRE_APRES_CONNEXION
    private static final String ACCOUNT_NUMBER = "ACCOUNT_NUMBER";
    private static final String ACCOUNT_NAME = "ACCOUNT_NAME";
    private static final String SOLDE_PRINCIPAL = "SOLDE_PRINCIPAL";
    private static final String SOLDE_COMMISSION = "SOLDE_COMMISSION";
    private static final String NUMERO_ABONNE = "NUMERO_ABONNNE";
    private static final String NUMERO_DE_RECHERCHE = "NUMERO_DE_RECHERCHE";
    private static final String TVA = "TVA";
    private static final String CODE_ISO_2_PAYS = "CODE_ISO_2_PAYS";
    private static final String CODE_PAYS_SELECT = "CODE_PAYS_SELECT";
    private static final String CODE_PAYS_TELEPHONE = "CODE_PAYS_TELEPHONE";
    private static final String DEVISE_PAYS_SELECT = "DEVISE_PAYS_SELECT";
    private static final String INITIATE_RESQUEST = "INITIATE_RESQUEST";
    private static final String INITIATE_RESPONSE = "INITIATE_RESPONSE";
    private static final String CASH_IN_REQUEST = "CASH_IN_REQUEST";
    private static final String LIST_RETRAIT_COMPTE = "LIST_RETRAIT_COMPTE";
    private static final String BUNDLE_I = "BUNDLE_I";
    private static final String ARRAY_RETRAIT_COMPTE = "ARRAY_RETRAIT_COMPTE";
    private static final String POSITION_RETRAIT_COMPTE = "POSITION_RETRAIT_COMPTE";
    private static final String LANGUE_CHANGER = "LANGUE_CHANGER";
    private static final String PAYS = "PAYS";
    private static final String KEY = "KEY";
    private static final String MPIN = "MPIN";

    //-------------------- customer (user) account details -------------------------------------
    private static final String CUSTOMER_NAME_ON_PROOF = "CUSTOMER_NAME_ON_PROOF";
    private static final String CUSTOMER_IMAGE_ON_PROOF = "CUSTOMER_IMAGE_ON_PROOF";
    private static final String CUSTOMER_SIGNATURE_ON_PROOF = "CUSTOMER_SIGNATURE_ON_PROOF";

    private static final String ID_PROOF_NAME = "ID_PROOF_NAME";
    private static final String ID_PROOF_NUMBER = "ID_PROOF_NUMBER";
    private static final String ID_PROOF_ISSUE_DATE = "ID_PROOF_ISSUE_DATE";
    private static final String ID_PROOF_DUE_DATE = "ID_PROOF_DUE_DATE";
    //-------------------- Ze End : user account details -------------------------------------

    private static final String KEY_JWT_AUTHENTICATION = "jwt_authentication";
    private static final String KEY_MY_QUESTION = "my_question";
    private static final String VIRTUAL_IMEI = "VIRTUAL_IMEI";


    private static SharedPrefManager mInstance;
    private static Context mCtx;

    private SharedPrefManager(Context context) {
        mCtx = context;
    }

    public static synchronized SharedPrefManager newInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPrefManager( context );
        }
        return mInstance;
    }



    // ********************* INFOS_MEMBRE_APRES_CONNEXION **********************

    //getter
    public String getAccountNumber() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( ACCOUNT_NUMBER, null );
    }

    //Setter
    public void setAccountNumber(@NonNull String accountNumber) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( ACCOUNT_NUMBER, accountNumber );
        editor.apply();
    }

    //getter
    public String getAccountName() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( ACCOUNT_NAME, null );
    }

    //Setter
    public void setAccountName(@NonNull String accountName) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( ACCOUNT_NAME, accountName );
        editor.apply();
    }


    //getter
    public String getTva() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( TVA, null );
    }

    //Setter
    public void setTva(@NonNull String tva) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( TVA, tva );
        editor.apply();
    }

    //getter
    public String getCodeIso2Pays() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( CODE_ISO_2_PAYS, null );
    }

    //Setter
    public void setCodeIso2Pays(@NonNull String codeIso2Pays) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( CODE_ISO_2_PAYS, codeIso2Pays );
        editor.apply();
    }


    //getter
    public String getCodePaysSelect() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( CODE_PAYS_SELECT, null );
    }

    //Setter
    public void setCodePaysSelect(@NonNull String codePaysSelect) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( CODE_PAYS_SELECT, codePaysSelect );
        editor.apply();
    }


     //getter
    public String getCodePaysTelephone() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( CODE_PAYS_TELEPHONE, null );
    }

    //Setter
    public void setCodePaysTelephone(@NonNull String codePaysTelephone) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( CODE_PAYS_TELEPHONE, codePaysTelephone );
        editor.apply();
    }


    //getter
    public String getDevisePaysSelect() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( DEVISE_PAYS_SELECT, null );
    }

    //Setter
    public void setDevisePaysSelect(@NonNull String devisePaysSelect) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( DEVISE_PAYS_SELECT, devisePaysSelect );
        editor.apply();
    }


 //getter
    public String getPays() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( PAYS, null );
    }

    //Setter
    public void setPays(@NonNull String pays) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( PAYS, pays );
        editor.apply();
    }




    //getter
    public String getSoldeCommission() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( SOLDE_COMMISSION, null );
    }

    //Setter
    public void setSoldeCommission(@NonNull String soldeCommission) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( SOLDE_COMMISSION, soldeCommission );
        editor.apply();
    }

    //getter
    public String getNumeroAbonne() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( NUMERO_ABONNE, null );
    }

    //Setter
    public void setNumeroAbonne(@NonNull String numeroAbonne) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( NUMERO_ABONNE, numeroAbonne );
        editor.apply();
    }



    //getter
    public String getMpin() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( MPIN, null );
    }

    //Setter
    public void setMpin(@NonNull String mpin) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( MPIN, mpin );
        editor.apply();
    }



    //getter
    public String getNumeroDeRecherche() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( NUMERO_DE_RECHERCHE, null );
    }

    //Setter
    public void setNumeroDeRecherche(@NonNull String numeroDeRecherche) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( NUMERO_DE_RECHERCHE, numeroDeRecherche );
        editor.apply();
    }







    //getter
    public String getCashInRequest() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( CASH_IN_REQUEST, null );
    }

    //Setter
    public void setCashInRequest(@NonNull String cashInRequest) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( CASH_IN_REQUEST, cashInRequest );
        editor.apply();
    }



    //getter
    public String getArrayRetraitCompte() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( ARRAY_RETRAIT_COMPTE, null );
    }

    //Setter
    public void setArrayRetraitCompte(@NonNull String arrayRetraitCompte) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( ARRAY_RETRAIT_COMPTE, arrayRetraitCompte );
        editor.apply();
    }


    //getter
    public String getPositionRetraitCompte() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( POSITION_RETRAIT_COMPTE, null );
    }

    //Setter
    public void setPositionRetraitCompte(@NonNull String positionRetraitCompte) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( POSITION_RETRAIT_COMPTE, positionRetraitCompte );
        editor.apply();
    }



 //getter
    public String getLangue() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString(LANGUE_CHANGER, null );
    }

    //Setter
    public void setLangue(@NonNull String lang) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(LANGUE_CHANGER, lang );
        editor.commit();
    }


    //-------------------- customer (user) account details ::: Getters and Setters ---------------------
    public String getCustomerNameOnProof() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( CUSTOMER_NAME_ON_PROOF, null );
    }

    public void setCustomerNameOnProof(@NonNull String customerNameOnProof) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( CUSTOMER_NAME_ON_PROOF, customerNameOnProof );
        editor.apply();
    }

    public String getCustomerImageOnProof() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( CUSTOMER_IMAGE_ON_PROOF, null );
    }

    public void setCustomerImageOnProof(@NonNull String customerImageOnProof) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( CUSTOMER_IMAGE_ON_PROOF, customerImageOnProof );
        editor.apply();
    }

    public String getCustomerSignatureOnProof() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( CUSTOMER_SIGNATURE_ON_PROOF, null );
    }

    public void setCustomerSignatureOnProof(@NonNull String customerSignatureOnProof) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( CUSTOMER_SIGNATURE_ON_PROOF, customerSignatureOnProof );
        editor.apply();
    }

    public String getIdProofName() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( ID_PROOF_NAME, null );
    }

    public void setIdProofName(@NonNull String idProofName) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( ID_PROOF_NAME, idProofName );
        editor.apply();
    }

    public String getIdProofNumber() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( ID_PROOF_NUMBER, null );
    }

    public void setIdProofNumber(@NonNull String idProofNumber) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( ID_PROOF_NUMBER, idProofNumber );
        editor.apply();
    }

    public String getIdProofIssueDate() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( ID_PROOF_ISSUE_DATE, null );
    }

    public void setIdProofIssueDate(@NonNull String idProofIssueDate) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( ID_PROOF_ISSUE_DATE, idProofIssueDate );
        editor.apply();
    }

    public String getIdProofDueDate() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( ID_PROOF_DUE_DATE, null );
    }

    public void setIdProofDueDate(@NonNull String idProofDueDate) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( ID_PROOF_DUE_DATE, idProofDueDate );
        editor.apply();
    }

    //----------------- Ze End customer (user) account details ::: Getters and Setters -----------------

    public String getKeyJwtAuthentication() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( KEY_JWT_AUTHENTICATION,"");
    }

    public void setKeyJwtAuthentication(String jwtAuthentication) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( KEY_JWT_AUTHENTICATION, jwtAuthentication );
        editor.apply();
    }

    public String getKeyMyQuestion() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( KEY_MY_QUESTION,"");
    }

    public void setKeyMyQuestion(String myQuestion) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( KEY_MY_QUESTION, myQuestion );
        editor.apply();
    }

    public String getVirtualImei() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        return sharedPreferences.getString( VIRTUAL_IMEI,"");
    }

    public void setVirtualImei(String virtualImei) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences( SHARED_PREF_NAME, Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( VIRTUAL_IMEI, virtualImei );
        editor.apply();
    }


}


