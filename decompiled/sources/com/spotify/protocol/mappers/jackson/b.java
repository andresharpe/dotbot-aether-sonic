package com.spotify.protocol.mappers.jackson;

import H2.c;
import android.annotation.SuppressLint;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.protocol.mappers.JsonMappingException;
import java.io.IOException;
import javax.annotation.Nullable;

@SuppressLint({"ConfiguringObjectMapper", "ConstructingObjectMapper"})
/* loaded from: classes2.dex */
public class b implements H2.b {

    /* renamed from: a, reason: collision with root package name */
    private final ObjectMapper f48919a;

    /* loaded from: classes2.dex */
    private class a implements H2.a {

        /* renamed from: a, reason: collision with root package name */
        private final JsonNode f48920a;

        a(String data) throws IOException {
            this.f48920a = b.this.f48919a.readTree(data);
        }

        @Override // H2.a
        public int a(int index) {
            JsonNode jsonNode = this.f48920a.get(index);
            if (jsonNode != null) {
                return jsonNode.asInt();
            }
            return 0;
        }

        @Override // H2.a
        public c b(int index) {
            return new C0435b(this.f48920a.get(index));
        }

        @Override // H2.a
        @Nullable
        public String c(int index) {
            JsonNode jsonNode = this.f48920a.get(index);
            if (jsonNode != null) {
                return jsonNode.asText();
            }
            return null;
        }
    }

    /* renamed from: com.spotify.protocol.mappers.jackson.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private class C0435b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final JsonNode f48922a;

        C0435b(JsonNode jsonNode) {
            this.f48922a = jsonNode;
        }

        @Override // H2.c
        public String a() throws JsonMappingException {
            try {
                return b.this.f48919a.writeValueAsString(this.f48922a);
            } catch (JsonProcessingException e4) {
                throw new JsonMappingException(e4);
            }
        }

        @Override // H2.c
        @Nullable
        public <T> T b(Class<T> cls) throws JsonMappingException {
            try {
                return (T) b.this.f48919a.convertValue(this.f48922a, cls);
            } catch (IllegalArgumentException e4) {
                throw new JsonMappingException(e4);
            }
        }
    }

    private b(ObjectMapper mapper) {
        this.f48919a = mapper;
    }

    public static b d() {
        return new b(new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false));
    }

    @Override // H2.b
    public String a(Object value) throws JsonMappingException {
        try {
            return this.f48919a.writeValueAsString(value);
        } catch (JsonProcessingException e4) {
            throw new JsonMappingException(e4);
        }
    }

    @Override // H2.b
    public H2.a b(String json) throws JsonMappingException {
        try {
            return new a(json);
        } catch (IOException e4) {
            throw new JsonMappingException(e4);
        }
    }
}
