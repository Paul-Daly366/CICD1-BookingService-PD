package ie.atu.sample.dto;

import jakarta.persistence.Access;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
    private Long bookingId;
    private String organiserName;
    private BigDecimal attendeeCount;
    private Long roomId;
    private String roomStatus;
}
