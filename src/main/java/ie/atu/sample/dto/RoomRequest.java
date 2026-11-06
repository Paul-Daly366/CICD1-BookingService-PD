package ie.atu.sample.dto;

import org.springframework.cloud.openfeign.FeignClient;


public class RoomRequest {
    private Long id;
    private String name;
    private int capacity;
}
