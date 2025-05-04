package com.example.calorytransformerjson.service;

import com.google.cloud.pubsub.v1.Publisher;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.TopicName;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PubSubPublisher {

    private final String topicId = "calorie-events";
    private final Publisher publisher;

    public PubSubPublisher() throws IOException {
        TopicName topicName = TopicName.of("YOUR_PROJECT_ID", topicId);
        this.publisher = Publisher.newBuilder(topicName).build();
    }

    public void publishMessage(String jsonData) throws Exception {
        ByteString data = ByteString.copyFromUtf8(jsonData);
        PubsubMessage pubsubMessage = PubsubMessage.newBuilder().setData(data).build();
        publisher.publish(pubsubMessage).get();
    }

    @PreDestroy
    public void shutdown() throws Exception {
        publisher.shutdown();
    }
}