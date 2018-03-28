import Holiday.DescriptionPage;
import Holiday.FilterPage;
import Holiday.HeaderPage;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
public class Testsuite extends Hooks {
HeaderPage headerPage=new HeaderPage();
FilterPage filterPage=new FilterPage();
DescriptionPage descriptionPage=new DescriptionPage();
@Test
public void regression(){
    headerPage.clickToCategory("Deal Finder");
    headerPage.selectDestination("All Spain");
    headerPage.selectAirport("LGW");
    headerPage.clickDaNi("Feb 2018");
    headerPage.selectDate("Apr 2018","9");
    headerPage.clickDaNi("7 nights");
    headerPage.nightSelect("7 nights");
    headerPage.selectParty("party","1","1");
    headerPage.search();
    filterPage.expandFilterType("List results by","Highest price first");
    filterPage.setFilterRating("star_rating-4");
    filterPage.expandFilterType("Board Basis","All Inclusive");
    filterPage.expandFilterType("Facilities","By the Beach");
    filterPage.expandFilterType("Destinations","Canaries");
    filterPage.expandFilterType("Holiday Themes","Good for Families");
    filterPage.clickGrid("Grid");
    String acName=filterPage.getProductName();
    System.out.println(acName);
    filterPage.selectDest("Costa Calero");
    String exName=descriptionPage.getProductName();
    System.out.println(exName);
    assertThat(exName,is(equalTo("Costa Calero")));
}
}
