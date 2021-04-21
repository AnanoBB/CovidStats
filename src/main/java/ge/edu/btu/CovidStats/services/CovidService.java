package ge.edu.btu.CovidStats.services;
import ge.edu.btu.CovidStats.services.model.Covid;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;


@WebService
public class CovidService {
    @WebMethod
    public List<Covid> getStatistic(){
        List<Covid> covidStatistics = new ArrayList<Covid>();
        covidStatistics.add(new Covid("spain",200,100,900));
        covidStatistics.add(new Covid("England",300,200,1000));
        covidStatistics.add(new Covid("Barcelona",400,300,800));
        covidStatistics.add(new Covid("Germany",500,400,700));
        return covidStatistics;

    }




}
