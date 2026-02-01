package com.spotify.protocol.mappers.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.spotify.protocol.types.ImageUri;
import java.io.IOException;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: com.spotify.protocol.mappers.jackson.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0434a extends StdDeserializer<ImageUri> {

        /* renamed from: a, reason: collision with root package name */
        private static final long f48917a = 1;

        public C0434a() {
            super(ImageUri.class);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImageUri b(JsonParser p4, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return new ImageUri(p4.getValueAsString());
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends StdSerializer<ImageUri> {

        /* renamed from: a, reason: collision with root package name */
        private static final long f48918a = 1;

        protected b() {
            super(ImageUri.class);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ImageUri value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeString(value.raw);
        }
    }
}
