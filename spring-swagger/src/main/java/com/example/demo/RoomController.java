package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/rooms")
@Api(value="rooms", tags=("rooms"))
public class RoomController {

    ;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value="Get All Rooms", notes="Get all rooms in the system", nickname="getRooms")
    public List<String> findAll(@RequestParam(name="roomNumber", required=false)String roomNumber){
       return Arrays.asList("abc","room");
    }
}