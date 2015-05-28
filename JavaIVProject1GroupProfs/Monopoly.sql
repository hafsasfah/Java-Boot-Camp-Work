DROP DATABASE "Monopoly";

CREATE DATABASE "Monopoly"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;
GRANT ALL ON DATABASE "Monopoly" TO postgres;
GRANT ALL ON DATABASE "Monopoly" TO public;


CREATE TABLE "Game"
(
  "ID" serial NOT NULL,
  "Name" character varying(50),
  "Completed" boolean,
  "CurrentPlayer" integer,
  CONSTRAINT "Game_PK" PRIMARY KEY ("ID"),
  CONSTRAINT "Game_Unique_Name" UNIQUE ("Name")
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Game"
  OWNER TO postgres;


CREATE TABLE "Player"
(
  "ID" serial NOT NULL,
  "Name" character varying(50),
  "Money" integer,
  "Game_ID" integer,
  "ParkedProperty_ID" integer,
  CONSTRAINT "Player_PK" PRIMARY KEY ("ID"),
  CONSTRAINT "Player_Game_ID_FK" FOREIGN KEY ("Game_ID")
      REFERENCES "Game" ("ID") MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Player"
  OWNER TO postgres;
  
  ALTER TABLE "Game"
  ADD CONSTRAINT "Game_CurrentPlayer_FK" FOREIGN KEY ("CurrentPlayer")
      REFERENCES "Player" ("ID") MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION;


CREATE TABLE "Property"
(
  "ID" serial NOT NULL,
  "Name" character varying(50),
  "PurchasePrice" integer,
  "RentalPrice" integer,
  "Owner_Player_ID" integer,
  "Game_ID" integer,
  CONSTRAINT "Property_PK" PRIMARY KEY ("ID"),
  CONSTRAINT "Property_Game_ID_FK" FOREIGN KEY ("Game_ID")
      REFERENCES "Game" ("ID") MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT "Property_Owner_Player_ID_FK" FOREIGN KEY ("Owner_Player_ID")
      REFERENCES "Player" ("ID") MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "Property"
  OWNER TO postgres;



ALTER TABLE "Player"
  ADD CONSTRAINT "Player_ParkedProperty_ID_FK" FOREIGN KEY ("ParkedProperty_ID")
      REFERENCES "Property" ("ID") MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION;