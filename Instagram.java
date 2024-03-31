class Instagram {
    String userId;
    String password;
    long cno;

    public void Initailize(String userId, String password, long cno) {
        this.userId = userId;
        this.password = password;

        this.cno = cno;
    }

    public void profile() {
        System.out.println(userId+" user ID");
        System.out.println(password+" password");
        System.out.println(cno+" contact number");

    }
}
