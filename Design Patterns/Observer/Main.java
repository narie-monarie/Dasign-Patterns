public class Main {
  public static void main(String[] args) {
    var dataSource = new DataSource();
    var sheet = new SpreadSheet();
    var sheet1 = new SpreadSheet();
    var chart = new Chart();

    dataSource.addObserver(sheet);
    dataSource.addObserver(sheet1);
    dataSource.addObserver(chart);

    dataSource.setValue(2);
  }
}







