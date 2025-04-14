/********************************************
*	DEVELOPER:	Cameron Ortega
* COLLABORATORS: <names>
*	LAST MODIFIED:	<date>
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    //TODO PART 3: test your setter/getter here!

    DACArecipient personA = new DACArecipient();

    personA.setAll("Chapeton-Lamas", "Nery", "12-4-789", "Guatemala",
     2451564, 3956753, 3956840, 'M');


    DACArecipient personB = new DACArecipient();
    personB.setSurname("Mendez");
    personB.setGivenName("Javier");
    personB.setUscisNumber("56-3-445");
    personB.setCountryOfOrigin("Venezuela");
    personB.setBirthday(2451564);
    personB.setValidFromDate(3956753);
    personB.setExpirationDate(3956840);
    personB.setSex('M');

    System.out.println("Person 1");
    System.out.println("-----------------------------");
    System.out.println("Surname: " + personA.getSurname());
    System.out.println("Given name: " + personA.getGivenName());
    System.out.println("USCIS Number: " + personA.getUscisNumber());
    System.out.println("Country of Origin: " + personA.getCountryOfOrigin());
    System.out.println("Birthday(JDN): " + personA.getBirthday());
    System.out.println("Valid From Date(JDN): " + personA.getValidFromDate());
    System.out.println("Expiration Date(JDN): " + personA.getExpirationDate());
    System.out.println("Sex: " + personA.getSex());

    // Print person 2
    System.out.println("\nPerson 2");
    System.out.println("-----------------------------");
    System.out.println("Surname: " + personB.getSurname());
    System.out.println("Given name: " + personB.getGivenName());
    System.out.println("USCIS Number: " + personB.getUscisNumber());
    System.out.println("Country of Origin: " + personB.getCountryOfOrigin());
    System.out.println("Birthday(JDN): " + personB.getBirthday());
    System.out.println("Valid From Date(JDN): " + personB.getValidFromDate());
    System.out.println("Expiration Date(JDN): " + personB.getExpirationDate());
    System.out.println("Sex: " + personB.getSex());
  }
}