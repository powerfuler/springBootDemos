package com.neo.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.rabbit.AmqpSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AmqpTest {

  @Autowired
  private AmqpSender sender;

  @Test
  public void testSimpleSend() {
    for (int i = 1; i < 6; i++) {
      this.sender.simpleSend("test simpleSend " + i);
    }
  }

  @Test
  public void testPsSend() {
    for (int i = 1; i < 6; i++) {
      this.sender.psSend("test psSend " + i);
    }
  }

  @Test
  public void testRoutingSend() {
    for (int i = 1; i < 6; i++) {
      this.sender.routingSend("order", "test routingSend " + i);
    }
  }

  @Test
  public void testTopicSend() {
    for (int i = 1; i < 6; i++) {
      this.sender.topicSend("user.add", "test topicSend " + i);
    }
  }
}