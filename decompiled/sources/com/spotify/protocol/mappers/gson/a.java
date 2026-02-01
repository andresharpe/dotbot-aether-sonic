package com.spotify.protocol.mappers.gson;

import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.spotify.protocol.mappers.JsonMappingException;
import com.spotify.protocol.types.ImageUri;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public class a implements H2.b {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f48912a;

    /* loaded from: classes2.dex */
    private static class b implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
        private b() {
        }

        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
            return Base64.decode(json.getAsJsonPrimitive().getAsString(), 2);
        }

        @Override // com.google.gson.JsonSerializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(Base64.encodeToString(src, 2));
        }
    }

    /* loaded from: classes2.dex */
    private static class c implements H2.a {

        /* renamed from: a, reason: collision with root package name */
        private final JsonArray f48913a;

        /* renamed from: b, reason: collision with root package name */
        private final Gson f48914b;

        c(Gson gson, JsonElement jsonElement) {
            this.f48914b = gson;
            this.f48913a = jsonElement.getAsJsonArray();
        }

        @Override // H2.a
        public int a(int index) {
            try {
                return this.f48913a.get(index).getAsInt();
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        @Override // H2.a
        @Nullable
        public H2.c b(int index) {
            try {
                return new d(this.f48914b, this.f48913a.get(index));
            } catch (RuntimeException unused) {
                return null;
            }
        }

        @Override // H2.a
        @Nullable
        public String c(int index) {
            try {
                return this.f48913a.get(index).getAsString();
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* loaded from: classes2.dex */
    private static class d implements H2.c {

        /* renamed from: a, reason: collision with root package name */
        private final Gson f48915a;

        /* renamed from: b, reason: collision with root package name */
        private final JsonElement f48916b;

        d(Gson gson, JsonElement jsonElement) {
            this.f48915a = gson;
            this.f48916b = jsonElement;
        }

        @Override // H2.c
        public String a() throws JsonMappingException {
            return this.f48915a.toJson(this.f48916b);
        }

        @Override // H2.c
        public <T> T b(Class<T> cls) throws JsonMappingException {
            try {
                return (T) this.f48915a.fromJson(this.f48916b, (Class) cls);
            } catch (RuntimeException e4) {
                throw new JsonMappingException(e4);
            }
        }
    }

    /* loaded from: classes2.dex */
    private static class e implements JsonDeserializer<ImageUri>, JsonSerializer<ImageUri> {
        private e() {
        }

        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImageUri deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
            return new ImageUri(json.getAsString());
        }

        @Override // com.google.gson.JsonSerializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JsonElement serialize(ImageUri src, Type typeOfSrc, JsonSerializationContext context) {
            return context.serialize(src.raw);
        }
    }

    private a(Gson gson) {
        this.f48912a = gson;
    }

    public static a c() {
        return new a(new GsonBuilder().registerTypeAdapter(ImageUri.class, new e()).registerTypeAdapter(byte[].class, new b()).create());
    }

    @Override // H2.b
    public String a(Object value) throws JsonMappingException {
        return this.f48912a.toJson(value);
    }

    @Override // H2.b
    public H2.a b(String json) throws JsonMappingException {
        try {
            return new c(this.f48912a, (JsonElement) this.f48912a.fromJson(json, JsonElement.class));
        } catch (RuntimeException e4) {
            throw new JsonMappingException(e4);
        }
    }
}
