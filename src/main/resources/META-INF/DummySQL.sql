USE ca2;

INSERT INTO infoentity (email, typeof) VALUES ("riki@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Riki", "Xenoblade",1);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Gaming", "Playing console games", 1);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345678", "Cell phone", 1);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Frontier Village 4th level", "The wooden house by the wall", 1, '1110');

INSERT INTO infoentity (email) VALUES ("Michel@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Michel", "Bans", 2);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Flowerpump", "Pumps da flowers", 2);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345679", "Cellular", 2);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Lige Her 2.th", "Right here", 2, 2770);

INSERT INTO infoentity (email) VALUES ("Bob@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Riko", "Bobo", 3);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("ProSwinger", "Don't ask", 3);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345680", "Cell phone", 3);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Not There", "Beside there", 3, 1000);

INSERT INTO infoentity (email) VALUES ("Grethe@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Lars", "Jon", 4);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Looping", "Infinite loops", 4);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345681", "Cell phone", 4);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("ThereWay 2.th", "here", 4, 1000);

INSERT INTO infoentity (email) VALUES ("john@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("john", "gogge", 5);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Boomarang", "Advanced Kangoroo", 5);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345682", "Cell phone", 5);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Frontier Village 4th level", "The wooden house by the wall", 1, 8220);

INSERT INTO infoentity (email) VALUES ("Polle@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Polle", "travolta", 6);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Gaming", "Playing console games", 6);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345683", "Cell phone", 6);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Frontier Village 4th level", "The wooden house by the wall", 6, 1220);

INSERT INTO infoentity (email) VALUES ("Søren@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Søren", "Hansen", 7);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Hairdresser", "Silky Smooth", 7);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345684", "Cell phone", 7);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Hollandsgade", "NotLyngby", 7, 1320);

INSERT INTO infoentity (email) VALUES ("happengut@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Lars", "Happengut", 8);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("painter", "PonyBodyPaint", 8);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345685", "Cell phone", 8);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("PopcornStreet 2", "Faraway", 8, 2730);

INSERT INTO infoentity (email) VALUES ("Kompi@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Kompi", "Lollegok", 9);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Programmer", "Doing all the work", 9);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345686", "Fax", 9);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Lollandvej", "Falster", 9, 3320);

INSERT INTO infoentity (email) VALUES ("troll@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Trolde", "Pus", 10);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("JellySplash", "On the phone", 10);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345687", "Cell phone", 10);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Frontier Village 4th level", "The wooden house by the wall", 10, 1110);

INSERT INTO infoentity (email) VALUES ("mos@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Morten", "Alfa", 11);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Music", "Plays the tuba", 11);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345688", "Cell phone", 11);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("FarmerWillie", "HereAgain", 11, 1111);

INSERT INTO infoentity (email) VALUES ("panon@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Panda", "Nonke", 12);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Gaming", "Playing console games", 12);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345689", "Cell phone", 12);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("InTheMiddle", "OfNowhere", 12, 1240);

INSERT INTO infoentity (email) VALUES ("ulma@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Ulma", "Xonta", 13);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("LivinOnTheEdge", "CarpeDiem", 13);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345690", "Cell phone", 13);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("TheSun", "TheDarkSide", 13, 2770);

INSERT INTO infoentity (email) VALUES ("Koko@tester.dk");
INSERT INTO person (firstName, lastName, pid) VALUES ("Schrappy", "Koko", 14);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("StoryTelling", "About Fat Pinguins", 14);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345691", "Cell phone", 14);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Backstage", "BehindTheScene", 14, 2630);

INSERT INTO infoentity (email) VALUES ("Uffe@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Uffe", "Guff", 15);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Guitar", "Player", 15);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345692", "Cell phone", 15);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Frontier Village 4th level", "The wooden house by the wall", 15, 1000);

INSERT INTO infoentity (email) VALUES ("Jensen@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Lars", "Jensen", 16);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("MoneyMaking", "100000$", 16);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345693", "Cell phone", 16);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("GreatWall", "OfChina", 16, 1220);

INSERT INTO infoentity (email) VALUES ("combo@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("mombo", "combo", 17);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Monkey", "spanker", 17);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345694", "Cell phone", 17);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Kolomba street", "Jojoba", 17, 1240);

INSERT INTO infoentity (email) VALUES ("Sambo@tester.dk");
INSERT INTO person (firstName, lastName, pid) VALUES ("Sambo", "Swartz", 18);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("RealLife", "MineCraft", 18);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345695", "Cell phone", 18);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("monzoway", "zimbabwe", 18, 9574);

INSERT INTO infoentity (email) VALUES ("Mathy@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Madhan", "Indigo", 19);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("BestSupporter", "Microsoft India", 19);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345696", "Cell phone", 19);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Microsoft", "Basement", 19, 2770);

INSERT INTO infoentity (email) VALUES ("Kolomo@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("mondo", "Tipers", 20);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Monkey", "Playing console games", 20);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345697", "Cell phone", 20);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("MyLittle", "Pony", 20, 1221);

INSERT INTO infoentity (email) VALUES ("Jamie@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Jamie", "Oliver", 21);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Cooking", "FoodLover", 21);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345698", "Cell phone", 21);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Frontier Village 4th level", "The wooden house by the wall", 21, 1050);

INSERT INTO infoentity (email) VALUES ("Okok@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Anni", "Tro", 22);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("På", "os to!", 22);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345699", "og", 22);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("JegTarIkkeFejl", "Homeland", 22, 3360);

INSERT INTO infoentity (email) VALUES ("lol@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Lol", "iPop", 23);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Candy", "Crush", 23);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345700", "Cell phone", 23);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Monokly", "ose", 23, 1023);

INSERT INTO infoentity (email) VALUES ("minus@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Plus", "minus", 24);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("mathTeacher", "Teaching math", 24);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345701", "Cell phone", 24);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Frontier Village 4th level", "The wooden house by the wall", 24, 1000);

INSERT INTO infoentity (email) VALUES ("testing@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Testo", "steron", 25);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Test", "ikel", 25);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345702", "Cell phone", 25);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Living", "Place", 25, 1000);

INSERT INTO infoentity (email) VALUES ("atestn@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Michael", "Veilis", 26);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Gaming", "Playing pc games", 26);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345703", "Cell phone", 26);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Rytterhaven 45", "In Farum", 26, 3520);

INSERT INTO infoentity (email) VALUES ("btest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Riki", "Martin", 27);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Singing", "Singing songs", 27);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345704", "Cell phone", 27);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village A", "Village by the letter A", 27, 3540);

INSERT INTO infoentity (email) VALUES ("ctest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Bob", "Marley", 28);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("High-Singing", "Singing while high on Hash", 28);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345705", "Cell phone", 28);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village B", "Village by the letter B", 28, 1052);

INSERT INTO infoentity (email) VALUES ("dtest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("John", "Doe", 29);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Life", "Doing life", 29);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345706", "Cell phone", 29);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village C", "Village by the letter C", 29, 1001);

INSERT INTO infoentity (email) VALUES ("etest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Patrick", "Desousa", 30);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Streaming", "Streaming Console Games", 30);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345707", "Cell phone", 30);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village D", "Village by the letter D", 30, 0910);

INSERT INTO infoentity (email) VALUES ("ftest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Lasse", "Hansen", 31);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Coding", "Logical Coding", 31);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345708", "Cell phone", 31);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village E", "Village by the letter E", 31, 1002);

INSERT INTO infoentity (email) VALUES ("gtest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Christian", "Jacobsen", 32);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Work", "Working with security", 32);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345709", "Cell phone", 32);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village F", "Village by the letter F", 32, 1003);

INSERT INTO infoentity (email) VALUES ("htest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Adolf", "Hitler", 33);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Dictator", "Dictator of Nazi Germany", 33);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345710", "Cell phone", 33);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village G", "Village by the letter G", 33, 1001);

INSERT INTO infoentity (email) VALUES ("itest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Joseph", "Stalin", 34);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Dictator", "Dicator of Soviet-Russia", 34);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345711", "Cell phone", 34);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village H", "Village by the letter H", 34, 1004);

INSERT INTO infoentity (email) VALUES ("jtest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Anders", "Fogh", 35);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("General Secretary", "General Secretary of Nasa", 35);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345712", "Cell phone", 35);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village I", "Village by the letter I", 35, 1005);

INSERT INTO infoentity (email) VALUES ("ktest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Lars", "Løkke", 36);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("PrimeMinister", "PrimeMinister of Denmark", 36);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345713", "Cell phone", 36);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village J", "Village by the letter J", 36, 1006);

INSERT INTO infoentity (email) VALUES ("ltest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Anders", "Matthesen", 37);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Comedian", "Proffesional standup comedian", 37);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345714", "Cell phone", 37);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village K", "Village by the letter K", 37, 1007);

INSERT INTO infoentity (email) VALUES ("mtest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Anders", "And", 38);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Andersine", "Har det sjovt med Andersine", 38);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345715", "Cell phone", 38);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Paradisæblevej 111", "Byen hvor Anders And bor", 38, 1008);

INSERT INTO infoentity (email) VALUES ("ntest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Andersine", "And", 39);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Anders", "Har det sjovt med Anders", 39);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345716", "Cell phone", 39);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village M", "Village by the letter M", 39, 1009);

INSERT INTO infoentity (email) VALUES ("otest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Harambe", "TheGorilla", 40);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Dead", "Shot to death by a man", 40);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345717", "Cell phone", 40);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village N", "Village by the letter N", 40, 1010);

INSERT INTO infoentity (email) VALUES ("ptest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Kappa", "Twitch", 41);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Kappa emoting", "The almighty emote on twitch", 41);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345718", "Cell phone", 41);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village O", "Village by the letter O", 41, 1011);

INSERT INTO infoentity (email) VALUES ("qtest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Alexander", "The Great", 42);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Conquering", "Conquering countries", 42);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345719", "Cell phone", 42);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village P", "Village by the letter P", 42, 1012);

INSERT INTO infoentity (email) VALUES ("rtest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Mulan", "Ching-Chong", 43);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Chinese Soldier", "Being a chinese soldier in love", 43);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345720", "Cell phone", 43);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village Q", "Village by the letter Q", 43, 1013);

INSERT INTO infoentity (email) VALUES ("stest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Master", "Chief", 44);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Super soldier", "almighty super soldier who always respawns after death", 44);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345721", "Cell phone", 44);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village R", "Village by the letter R", 44, 1014);

INSERT INTO infoentity (email) VALUES ("ttest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Varian", "Wrynn", 45);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("King", "King of StormWind", 45);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345722", "Cell phone", 45);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village S", "Village by the letter S", 45, 1015);

INSERT INTO infoentity (email) VALUES ("utest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Anduin", "Wrynn", 46);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Prince", "Prince of StormWind", 46);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345723", "Cell phone", 46);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village T", "Village by the letter T", 46, 1016);

INSERT INTO infoentity (email) VALUES ("vtest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Illidan", "Stormrage", 47);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Betrayer", "Betraying people....duh", 47);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345724", "Cell phone", 47);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village U", "Village by the letter U", 47, 1017);

INSERT INTO infoentity (email) VALUES ("xtest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Laura", "Bodevig", 48);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Riding", "Riding horses(and dudes)", 48);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345725", "Cell phone", 48);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village V", "Village by the letter V", 48, 1018);

INSERT INTO infoentity (email) VALUES ("ytest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Lars", "Larsen", 49);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Driving", "Driving a bus", 49);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345726", "Cell phone", 49);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village X", "Village by the letter X", 49, 1019);

INSERT INTO infoentity (email) VALUES ("ztest@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Lotte", "HvorErDuHenne", 50);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Hiding", "Hiding from everyone", 50);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345727", "Cell phone", 50);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village Y", "Village by the letter Y", 50, 1020);

INSERT INTO infoentity (email) VALUES ("1test@tester.dk", "person");
INSERT INTO person (firstName, lastName, pid) VALUES ("Pipi", "Langstrømpe", 51);
INSERT INTO hobby (hobbyName, description, fk_pid) VALUES ("Parentless", "No parents but have a horse and a monkey", 51);
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345728", "Cell phone", 51);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village Z", "Village by the letter Z", 51, 1021);

INSERT INTO infoentity (email) VALUES ("a2test1@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76787678", "companyA","company with the letter A", 10, 5000, 52);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345729", "Cell phone", 52);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 1", "Village that likes the number 1", 52, 1022);

INSERT INTO infoentity (email) VALUES ("a2test2@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76782678", "companyB","company with the letter B", 50, 10000, 53);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345730", "Cell phone", 53);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 2", "Village that likes the number 2", 53, 1023);

INSERT INTO infoentity (email) VALUES ("a2test3@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("80900908", "companyC","company with the letter C", 5, 2500, 54);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345731", "Cell phone", 54);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 3", "Village that likes the number 3", 54, 1024);

INSERT INTO infoentity (email) VALUES ("a2test4@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("70001378", "companyD","company with the letter D", 560, 555000, 55);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345732", "Cell phone", 55);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 4", "Village that likes the number 4", 55, 1025);

INSERT INTO infoentity (email) VALUES ("a2test5@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("22287338", "companyE","company with the letter E", 410, 445000, 56);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345733", "Cell phone", 56);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 5", "Village that likes the number 5", 56, 1026);

INSERT INTO infoentity (email) VALUES ("a2test33@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("06223678", "companyF","company with the letter F", 23, 52000, 57);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345734", "Cell phone", 57);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 6", "Village that likes the number 6", 57, 1056);

INSERT INTO infoentity (email) VALUES ("a1test44@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76009978", "companyG","company with the letter G", 16, 6000, 58);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345735", "Cell phone", 58);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 7", "Village that likes the number 7", 58, 1057);

INSERT INTO infoentity (email) VALUES ("a1test55@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("11187678", "companyH","company with the letter H", 2, 500,59);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345736", "Cell phone", 59);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 8", "Village that likes the number 8", 59, 1045);

INSERT INTO infoentity (email) VALUES ("a1test66@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("00987678", "companyI","company with the letter I", 180, 590000, 60);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345737", "Cell phone", 60);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 9", "Village that likes the number 9", 60, 1050);

INSERT INTO infoentity (email) VALUES ("a1test10@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("18273645", "companyJ","company with the letter j", 110, 125000, 61);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("22322278", "Cell phone", 61);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Village 10", "Village that likes the number 10", 61, 1055);

INSERT INTO infoentity (email) VALUES ("a1tt@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76989128", "companyM", "compi", 110, 125000, 62);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345739", "Cell phone", 62);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Mantra", "beatCity", 62, 1061);

INSERT INTO infoentity (email) VALUES ("c23@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76985567", "companyC","company with the letter j", 110, 125000, 63);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345740", "Cell phone", 63);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Her", "er jeg", 63, 1064);

INSERT INTO infoentity (email) VALUES ("cm@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76449678", "companyo", "covv", 110, 125300, 64);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345741", "Cell phone", 64);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Mantra", "beatCity", 64, 1114);

INSERT INTO infoentity (email) VALUES ("a1t3t@tester.dk");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76989378", "companye2", "comss", 110, 125500, 65);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345742", "Cell phone", 65);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Mantra", "beatCity", 65, 1118);

INSERT INTO infoentity (email) VALUES ("alibaba@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76989278", "compamama", "nambi", 110, 1250, 66);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345743", "Cell phone", 66);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Lon", "don", 66, 1120);

INSERT INTO infoentity (email) VALUES ("angala@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76982222", "come", "on", 110, 111000, 67);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345744", "Cell phone", 67);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Man", "son", 67, 1120);

INSERT INTO infoentity (email) VALUES ("mambo@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76911111", "campari", "codos", 110, 5000, 68);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345745", "Cell phone", 68);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Hyper", "beam", 68, 1359);

INSERT INTO infoentity (email) VALUES ("a1t3tuj@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76989678", "companye2", "comss", 110, 12, 69);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345746", "Cell phone", 69);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Mantra", "beatCity", 69, 1353);

INSERT INTO infoentity (email) VALUES ("mint@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("76989888", "companye2", "commas", 110, 125998, 70);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345747", "Cell phone", 70);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("Tan", "beay", 70, 1113);

INSERT INTO infoentity (email) VALUES ("mmo@tester.dk", "company");
INSERT INTO company (cvr, cname, description, no_of_employees, market_value, cid) VALUES ("09999678", "cony", "cosmoss", 110, 125000, 71);  
INSERT INTO phone(pnum, description, fk_id) VALUES ("12345748", "Cell phone", 71);
INSERT INTO address (street, additionalinfo, fk_id, fk_zipcode) VALUES ("tiki", "kon", 71, 1092);