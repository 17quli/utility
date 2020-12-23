/**********************************************************************************

IMPORTANT : Do not run this script multiple times in same enviornment. Make sure you connect to correct environment before running!!!

020719 ird0sxd Script to populate domains and subdomains. Do not run multiple times.
********************************************************************************* */
--truncate table lcf.sub_domain;
--truncate table lcf.domain;
--truncate table lcf.data_domain_expanded;




Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (1,'PARTY','Someone or something that plays a role in the tax system.  E.g. company, trust, natural person, tax agent' );
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (2,'ACCOUNT','An account is a distinct part of the tax system.  E.g. Income tax, GST, Student loan scheme, Working for families.' );
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (3,'RETURN','A return is a form that specifies a Party’s position with respect to the obligations and entitlements of an account for a specific period of time.  E.g. IR101 is the return that is completed by a customer to specify their GST position for a period of 1, 2 or 6 months.');
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (4,'RELATIONSHIP','An association between parties, profiles and accounts.  E.g. One company being a shareholder in another company is a party to party relationship (shareholder of), A company being an agent for a trust for GST is a party to account relationship (tax agent of).');
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (5,'DEBT','When a customer does not meet their payment obligations for an account this results in a debt being created.');
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (6,'WORK','A task to be carried out by an IR employee or automated system that is managed by the Start system.  E.g. A customer writing IR a letter to request an updated bank account will create a work item for an IR employee to change that customers bank details.');
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (7,'OBLIGATION_AND_ENTITLEMENT','Actions that should be taken by IR and customers that are specified in the legislation');
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (8, 'PARTY_FINANCE','The financial transactions that are applied to an account.  E.g. payments, refunds, write-offs etc.');
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (9,'AUDIT','An investigation by an IR employee into the compliance of an IR customer.');
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (10,'LEGAL','The work done by the IR Legal Services Team.  Includes prosecutions, opinions etc.');
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME,DOMAIN_COMMENTS) 
values (11,'PROPERTY','Data about properties,. Includes information: ownership, transaction history, valuations, land area etc.');
Insert into LCF.DOMAIN (PRIMARY_DOMAIN_KEY,DOMAIN_NAME, DOMAIN_COMMENTS) 
values (12,'IR_INTERNAL','Details about IR staff and internal processes carrying out work and the costs associated with IR activities.  Will provide a customer view of costs.(Cost to serve at customer level)');

COMMIT;

SELECT * FROM DOMAIN;


-- Party 1
INSERT INTO SUB_DOMAIN VALUES (1,1,'PARTIES');
INSERT INTO SUB_DOMAIN VALUES (1,2,'ADVERSE_EVENTS');
INSERT INTO SUB_DOMAIN VALUES (1,3,'INTERACTIONS');
INSERT INTO SUB_DOMAIN VALUES (1,4,'ASSETS');
INSERT INTO SUB_DOMAIN VALUES (1,5,'INCOME');
INSERT INTO SUB_DOMAIN VALUES (1,6,'CONTACT_DETAILS');
INSERT INTO SUB_DOMAIN VALUES (1,7,'ROLES');


-- Account 2

INSERT INTO SUB_DOMAIN VALUES (2,1,'ACCOUNTS(CORE_TAX)');
INSERT INTO SUB_DOMAIN VALUES (2,2,'CONTACT_DETAILS');
INSERT INTO SUB_DOMAIN VALUES (2,3,'ACCOUNTS(LEGAL)');
INSERT INTO SUB_DOMAIN VALUES (2,4,'ACCOUNTS(INTERNATIONAL_TAX)');
INSERT INTO SUB_DOMAIN VALUES (2,5,'TAX_TYPES');
INSERT INTO SUB_DOMAIN VALUES (2,6,'ACCOUNTS(SOCIAL_POLICY)');
INSERT INTO SUB_DOMAIN VALUES (2,7,'ACCOUNTS(WITHHOLDING_TAX)');

-Return 3


INSERT INTO SUB_DOMAIN VALUES (3,1,'RETURNS');
INSERT INTO SUB_DOMAIN VALUES (3,2,'COMPLIANCE');


-Relationship 4

INSERT INTO SUB_DOMAIN VALUES (4,1,'GROUPS');
INSERT INTO SUB_DOMAIN VALUES (4,2,'PARTIES');
INSERT INTO SUB_DOMAIN VALUES (4,3,'ACCOUNTS');
INSERT INTO SUB_DOMAIN VALUES (4,4,'PARTY-ACCOUNT');


-Debt 5

INSERT INTO SUB_DOMAIN VALUES (5,1,'COLLECTIONS');
INSERT INTO SUB_DOMAIN VALUES (5,2,'LIEN');
INSERT INTO SUB_DOMAIN VALUES (5,3,'BANKRUPTCIES');
INSERT INTO SUB_DOMAIN VALUES (5,4,'DEDUCTIONS');
INSERT INTO SUB_DOMAIN VALUES (5,5,'INSTALMENT_PLANS');
INSERT INTO SUB_DOMAIN VALUES (5,6,'COMPLIANCE');


-- Work 6

INSERT INTO SUB_DOMAIN VALUES (6,1,'LEGAL_CASES');
INSERT INTO SUB_DOMAIN VALUES (6,2,'AUDIT_CASES');
INSERT INTO SUB_DOMAIN VALUES (6,3,'WORK_ITEMS');
INSERT INTO SUB_DOMAIN VALUES (6,4,'INTERVENTIONS');
INSERT INTO SUB_DOMAIN VALUES (6,5,'REGISTRATIONS');
INSERT INTO SUB_DOMAIN VALUES (6,6,'COMMUNITY_COMPLIANCE_REVIEWS');
INSERT INTO SUB_DOMAIN VALUES (6,7,'COLLECTION_CASES');


COMMIT;


-- Obligation and entitlement 7

INSERT INTO SUB_DOMAIN VALUES (7,1,'AEOI');
INSERT INTO SUB_DOMAIN VALUES (7,2,'FATCA');
INSERT INTO SUB_DOMAIN VALUES (7,3,'KIWI_SAVER');
INSERT INTO SUB_DOMAIN VALUES (7,4,'CHILDSUPPORT');
INSERT INTO SUB_DOMAIN VALUES (7,5,'WFFTC');
INSERT INTO SUB_DOMAIN VALUES (7,6,'OTHER');
INSERT INTO SUB_DOMAIN VALUES (7,7,'PAID_PARENTAL_LEAVE');
INSERT INTO SUB_DOMAIN VALUES (7,8,'STUDENT_LOANS');

-- Party Finance 8

INSERT INTO SUB_DOMAIN VALUES (8,1,'REVENUE_ACCOUNTING');
INSERT INTO SUB_DOMAIN VALUES (8,2,'PAYMENTS');
INSERT INTO SUB_DOMAIN VALUES (8,3,'REFUNDS');
INSERT INTO SUB_DOMAIN VALUES (8,4,'WRITE_OFFS');
INSERT INTO SUB_DOMAIN VALUES (8,5,'TRANSACTIONS');



-- Audit 9
INSERT INTO SUB_DOMAIN VALUES (9,1,'AUDIT');


-- Legal 10


INSERT INTO SUB_DOMAIN VALUES (10,1,'OPINIONS');
INSERT INTO SUB_DOMAIN VALUES (10,2,'PROSECUTIONS');
INSERT INTO SUB_DOMAIN VALUES (10,3,'CLARIFICATIONS');
INSERT INTO SUB_DOMAIN VALUES (10,4,'POSITIONS');




-- Property 11

INSERT INTO SUB_DOMAIN VALUES (11,1,'PROPERTIES');
INSERT INTO SUB_DOMAIN VALUES (11,2,'PHYSICAL_ADDRESSES');


-- IR Internal 12


INSERT INTO SUB_DOMAIN VALUES (12,1,'FINANCES');
INSERT INTO SUB_DOMAIN VALUES (12,2,'STAFF');


COMMIT;

SELECT * FROM SUB_DOMAIN;



