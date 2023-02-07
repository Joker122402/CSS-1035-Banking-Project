public abstract class BankAccount {
  private String accountNumber;
  private String firstName;
  private String lastName; 

  protected BankAccount() {
  }
  protected BankAccount(String accountNumber, String firstName, String lastName) { 
    this.accountNumber = accountNumber;
    this.firstName = firstName;
    this.lastName = lastName;
  }
 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "BankAccount [accountNumber= " + accountNumber + ", firstName= " + firstName + ", lastName= " + lastName + "]";
  }
}