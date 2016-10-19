-- Table: public.person

-- DROP TABLE public.person;

CREATE TABLE public.person
(
  id integer NOT NULL,
  "position" integer,
  name text,
  family text,
  "dateOfBird" date,
  "experienceYear" numeric,
  wage bigint,
  "wagePeryear" numeric,
  CONSTRAINT id PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.person
  OWNER TO postgres;
