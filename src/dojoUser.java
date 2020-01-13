public class dojoUser
{
    private String lucEmail="";
    private String name="";
    private String gradYear="";


    public dojoUser()
    {
        lucEmail="defaultUser";
        name="password";
        gradYear="earth";



    }
    public dojoUser(String inName, String inPassword)
    {
        lucEmail=inName;
        name=inPassword;
        gradYear="earth";

    }
    public dojoUser(String inName, String inPassword, String bLoc)
    {
        lucEmail=inName;
        name=inPassword;
        gradYear=bLoc;

    }
    //get methods for all info
    public String getLucEmail()
    {
        return lucEmail;
    }
    public String getName()
    {
        return name;
    }

    public String getGradYear()
    {
        return gradYear;
    }
    public String toString()
    {
        return "Email: "+lucEmail+" name: "+name+" gradYear: "+gradYear;
    }



}
