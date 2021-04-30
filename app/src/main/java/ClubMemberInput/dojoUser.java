package ClubMemberInput;
public class dojoUser {
    private String lucEmail="";
    private String name="";
    private String id="";
    private String gradYear="";
    private String major="";


    public dojoUser() {
        lucEmail="defaultUser";
        name="password";
        id = "000000000";
        gradYear="earth";
        major="stemLOL";
    }

    public dojoUser(String inName, String inPassword) {
        lucEmail=inName;
        name=inPassword;
        id = "000000000";
        gradYear="earth";
        gradYear="freshie";
        major="stemLOL";
    }

    public dojoUser(String inName, String inPassword,String loyolaId, String bLoc, String maj) {
        lucEmail=inName;
        name=inPassword;
        id=loyolaId;
        gradYear=bLoc;
        major=maj;
    }

    //get methods for all info
    public String getLucEmail() {
        return lucEmail;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGradYear() {
        return gradYear;
    }

    public String getMajor() {
        return major;
    }

    public String toString() {
        return "Email: "+lucEmail+" name: "+name+" ID: " +id+ " gradYear: "+gradYear+" Major: "+major;
    }



}
