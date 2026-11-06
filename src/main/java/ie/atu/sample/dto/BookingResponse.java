package ie.atu.sample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
    private Long bookingId;
    private String organiserName;
    private int attendeeCount;
    private Long roomId;
    private String roomStatus;
}
