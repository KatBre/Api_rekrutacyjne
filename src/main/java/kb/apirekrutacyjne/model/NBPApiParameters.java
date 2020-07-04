package kb.apirekrutacyjne.model;

import kb.apirekrutacyjne.DateTimeUtilities;
import kb.apirekrutacyjne.exception.DateTimeParsingException;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class NBPApiParameters {
    private LocalDate startDate;
    private LocalDate endDate;

    @Setter
    private NBPCurrency currency;

    public void setEndDate(String userInput) throws DateTimeParsingException {
        this.endDate = DateTimeUtilities.loadEndDate(userInput);
    }

    public void setStartDate(String userInput) throws DateTimeParsingException {
        this.startDate = DateTimeUtilities.loadStartDate(userInput, endDate);
    }
}
