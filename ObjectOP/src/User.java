public class User {
    private String login;
    private String password;

    Basket userBasket = new Basket();

    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}