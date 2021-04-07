package appl;

import interfaces.IPrintable;
import items.*;


public class MassMediaAppl {

    public static void main(String[] args) {
        MassMedia[] ans = {
                new Newspaper("Vestnik", 12,14),
                new Newspaper("Pravda",16,16),
                new Journal("Fashion",10,122,true),
                new Journal("Java", 8,86,false),
                new NewsPortal("News", "news.com.eu"),
                new NewsPortal("Berlin_news", "bz-berlin.de"),
                new WebSite("Journal", "journal.com", "Etti"),
                new WebSite("Mitra", "mitra.de", "Mira")
        };
        for(MassMedia an : ans){
            if(an instanceof IPrintable)
                ((IPrintable) an).print();
        }
    }
}
