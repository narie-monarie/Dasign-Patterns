public class Main {
  public static void main(String[] args) {

  }
}

public class OnlineStore {

  private Long id;
  private String name;
  private String address;
  private String budget;
  private Long discountRate;

  private static class Builder {

    private Long id;
    private String name;
    private String address;
    private String budget;
    private Long discountRate;

    public Builder(Long id) {
      this.id = id;
    }

    public Builder withName(String name) {
      this.name = name;
      return this;
    }

    public Builder withAddress(String address) {
      this.address = address;
      return this;
    }

    public Builder withBudget(String budget) {
      this.budget = budget;
      return this;
    }

    public Builder withDiscountRate(String discountRate) {
      this.discountRate = discountRate;
      return this;
    }

    public OnlineStore build() {
      OnlineStore onlineStore = new OnlineStore();
      onlineStore.id = this.id;
      onlineStore.name = this.name;
      onlineStore.address = this.address;
      onlineStore.budget = this.budget;
      onlineStore.discountRate = this.discountRate;

      return onlineStore;
    }
  }
}
