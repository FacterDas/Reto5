/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.InterFace;

import com.example.demo.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author facte
 */
public interface MessageInterface extends CrudRepository <Message, Integer>{
    
}
