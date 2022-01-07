package com.hotelBookingSystem.group.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
@DynamoDBTable(tableName = "room")
public class Room {
    
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey()
    private String roomId;
    @DynamoDBAttribute
    private String room_number;
    @DynamoDBTypeConvertedEnum
    @DynamoDBAttribute
    private RoomTypes room_type;
    @DynamoDBAttribute
    private Integer number_beds;
    
}