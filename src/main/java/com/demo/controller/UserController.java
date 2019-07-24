package com.demo.controller;

import com.demo.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(value="用户信息查询",description = "用户基本信息操作API", tags = "UserApi", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping(value = "/user", produces =  MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    @ApiOperation(value = "/getUser", notes = "根据姓名查询用户信息")
    @RequestMapping(value = "getUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@RequestParam("name") String name){
        User user = new User();
        user.setAge(25);
        user.setAddress("河南郑州");
        user.setSex("男");
        user.setName(name);
        return user;
    }

    @ApiOperation(value = "/addUser", notes = "添加一个用户")
    @RequestMapping(value = "addUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User addUser(@RequestBody User user){
        return user;
    }



}
