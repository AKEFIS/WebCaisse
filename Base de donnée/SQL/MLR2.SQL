CREATE DATABASE IF NOT EXISTS webcaisse_ap2;
USE webcaisse_ap2;
# -----------------------------------------------------------------------------
#       TABLE : FORMULEFIDELISATION
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS FORMULEFIDELISATION
 (
   IDFORMULEFIDELISATION INTEGER(16) NOT NULL  ,
   NOMFORMULEFIDELISATION VARCHAR(255) NULL  ,
   DESCRIPTIONFORMULEFIDELISATION VARCHAR(255) NULL  
   , PRIMARY KEY (IDFORMULEFIDELISATION) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : UTILISATEUR
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS UTILISATEUR
 (
   IDUTILISATEUR INTEGER(16) NOT NULL  ,
   NOM VARCHAR(64) NULL  ,
   PRENOM VARCHAR(64) NULL  ,
   ADRESSEMAIL VARCHAR(255) NULL  ,
   MOTDEPASSE VARCHAR(255) NULL  ,
   ADRESSE VARCHAR(255) NULL  ,
   CODEPOSTAL INTEGER(10) NULL  ,
   VILLE VARCHAR(255) NULL  
   , PRIMARY KEY (IDUTILISATEUR) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : CONSOMMATEUR
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS CONSOMMATEUR
 (
   IDUTILISATEUR INTEGER(16) NOT NULL  ,
   NOM VARCHAR(64) NULL  ,
   PRENOM VARCHAR(64) NULL  ,
   ADRESSEMAIL VARCHAR(255) NULL  ,
   MOTDEPASSE VARCHAR(255) NULL  ,
   ADRESSE VARCHAR(255) NULL  ,
   CODEPOSTAL INTEGER(10) NULL  ,
   VILLE VARCHAR(255) NULL  
   , PRIMARY KEY (IDUTILISATEUR) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : CLIENT
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS CLIENT
 (
   IDUTILISATEUR INTEGER(16) NOT NULL  ,
   ADRESSESIEGESOCIAL VARCHAR(255) NULL  ,
   CODEPOSTALSIEGESOCIAL INTEGER(10) NULL  ,
   VILLESIEGESOCIAL VARCHAR(255) NULL  ,
   NOM VARCHAR(64) NULL  ,
   PRENOM VARCHAR(64) NULL  ,
   ADRESSEMAIL VARCHAR(255) NULL  ,
   MOTDEPASSE VARCHAR(255) NULL  ,
   ADRESSE VARCHAR(255) NULL  ,
   CODEPOSTAL INTEGER(10) NULL  ,
   VILLE VARCHAR(255) NULL  
   , PRIMARY KEY (IDUTILISATEUR) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : POINTDEVENTE
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS POINTDEVENTE
 (
   IDPOINTDEVENTE INTEGER(16) NOT NULL  ,
   IDFORMULEFIDELISATION INTEGER(16) NOT NULL  ,
   IDUTILISATEUR INTEGER(16) NOT NULL  ,
   ADRESSE VARCHAR(255) NULL  ,
   CODEPOSTAL INTEGER(10) NULL  ,
   VILLE VARCHAR(255) NULL  ,
   NOMPOINTDEVENTE VARCHAR(255) NULL  
   , PRIMARY KEY (IDPOINTDEVENTE) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       INDEX DE LA TABLE POINTDEVENTE
# -----------------------------------------------------------------------------


CREATE  INDEX I_FK_POINTDEVENTE_FORMULEFIDELISATION
     ON POINTDEVENTE (IDFORMULEFIDELISATION ASC);

CREATE  INDEX I_FK_POINTDEVENTE_CLIENT
     ON POINTDEVENTE (IDUTILISATEUR ASC);


# -----------------------------------------------------------------------------
#       CREATION DES REFERENCES DE TABLE
# -----------------------------------------------------------------------------


ALTER TABLE CONSOMMATEUR 
  ADD FOREIGN KEY FK_CONSOMMATEUR_UTILISATEUR (IDUTILISATEUR)
      REFERENCES UTILISATEUR (IDUTILISATEUR) ;


ALTER TABLE CLIENT 
  ADD FOREIGN KEY FK_CLIENT_UTILISATEUR (IDUTILISATEUR)
      REFERENCES UTILISATEUR (IDUTILISATEUR) ;


ALTER TABLE POINTDEVENTE 
  ADD FOREIGN KEY FK_POINTDEVENTE_FORMULEFIDELISATION (IDFORMULEFIDELISATION)
      REFERENCES FORMULEFIDELISATION (IDFORMULEFIDELISATION) ;


ALTER TABLE POINTDEVENTE 
  ADD FOREIGN KEY FK_POINTDEVENTE_CLIENT (IDUTILISATEUR)
      REFERENCES CLIENT (IDUTILISATEUR) ;

