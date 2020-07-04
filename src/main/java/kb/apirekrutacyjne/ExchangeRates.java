package kb.apirekrutacyjne;

import lombok.Data;

import java.util.List;
//POJO - Plain old java object
//-pusty kontruktor
//-prywatne pola
//-gettery settery

@Data
public class ExchangeRates {
    private String table;
    private String currency;
    private String code;
    private List<Rate> rates;
}
