package com.amazonaws.util.json;

import com.amazonaws.util.k;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class d implements JsonDeserializer<Date>, JsonSerializer<Date> {

    /* renamed from: a, reason: collision with root package name */
    private SimpleDateFormat f24316a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f24317b;

    /* renamed from: c, reason: collision with root package name */
    private final SimpleDateFormat f24318c = new SimpleDateFormat(k.f24329a);

    public d(String[] strArr) {
        this.f24317b = Arrays.asList(strArr);
    }

    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String asString = jsonElement.getAsString();
        for (String str : this.f24317b) {
            try {
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
                this.f24316a = simpleDateFormat;
                date.setTime(simpleDateFormat.parse(asString).getTime());
                return date;
            } catch (ParseException unused) {
            }
        }
        try {
            return DateFormat.getDateInstance(2).parse(asString);
        } catch (ParseException e4) {
            throw new JsonParseException(e4.getMessage(), e4);
        }
    }

    @Override // com.google.gson.JsonSerializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonPrimitive jsonPrimitive;
        synchronized (this.f24318c) {
            jsonPrimitive = new JsonPrimitive(this.f24318c.format(date));
        }
        return jsonPrimitive;
    }
}
