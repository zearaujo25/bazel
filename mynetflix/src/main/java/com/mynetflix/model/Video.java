package com.mynetflix.model;

import java.util.List;
import java.util.Optional;
import com.fasterxml.jackson.databind.annotation.JsonSerialize; 
import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as=ImmutableVideo.class)
@JsonDeserialize(as=ImmutableVideo.class)
public interface Video {
      String name();
      String id();
}
