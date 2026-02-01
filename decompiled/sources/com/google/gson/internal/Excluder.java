package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.harman.analytics.deviceAws.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private boolean requireExpose;
    private double version = IGNORE_VERSIONS;
    private int modifiers = a.f37827j;
    private boolean serializeInnerClasses = true;
    private List<ExclusionStrategy> serializationStrategies = Collections.emptyList();
    private List<ExclusionStrategy> deserializationStrategies = Collections.emptyList();

    private boolean excludeClassChecks(Class<?> cls) {
        if (this.version != IGNORE_VERSIONS && !isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(cls)) || isAnonymousOrNonStaticLocal(cls)) {
            return true;
        }
        return false;
    }

    private boolean excludeClassInStrategy(Class<?> cls, boolean z3) {
        List<ExclusionStrategy> list;
        if (z3) {
            list = this.serializationStrategies;
        } else {
            list = this.deserializationStrategies;
        }
        Iterator<ExclusionStrategy> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls) && !isStatic(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    private boolean isInnerClass(Class<?> cls) {
        if (cls.isMemberClass() && !isStatic(cls)) {
            return true;
        }
        return false;
    }

    private boolean isStatic(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    private boolean isValidSince(Since since) {
        if (since != null && since.value() > this.version) {
            return false;
        }
        return true;
    }

    private boolean isValidUntil(Until until) {
        if (until != null && until.value() <= this.version) {
            return false;
        }
        return true;
    }

    private boolean isValidVersion(Since since, Until until) {
        if (isValidSince(since) && isValidUntil(until)) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final boolean z3;
        final boolean z4;
        Class<? super T> rawType = typeToken.getRawType();
        boolean excludeClassChecks = excludeClassChecks(rawType);
        if (!excludeClassChecks && !excludeClassInStrategy(rawType, true)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!excludeClassChecks && !excludeClassInStrategy(rawType, false)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z3 && !z4) {
            return null;
        }
        return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
            private TypeAdapter<T> delegate;

            private TypeAdapter<T> delegate() {
                TypeAdapter<T> typeAdapter = this.delegate;
                if (typeAdapter == null) {
                    TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(Excluder.this, typeToken);
                    this.delegate = delegateAdapter;
                    return delegateAdapter;
                }
                return typeAdapter;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public T read2(JsonReader jsonReader) throws IOException {
                if (z4) {
                    jsonReader.skipValue();
                    return null;
                }
                return delegate().read2(jsonReader);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t3) throws IOException {
                if (z3) {
                    jsonWriter.nullValue();
                } else {
                    delegate().write(jsonWriter, t3);
                }
            }
        };
    }

    public Excluder disableInnerClassSerialization() {
        Excluder m0clone = m0clone();
        m0clone.serializeInnerClasses = false;
        return m0clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z3) {
        if (!excludeClassChecks(cls) && !excludeClassInStrategy(cls, z3)) {
            return false;
        }
        return true;
    }

    public boolean excludeField(Field field, boolean z3) {
        List<ExclusionStrategy> list;
        Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != IGNORE_VERSIONS && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z3 ? !expose.deserialize() : !expose.serialize()))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(field.getType())) || isAnonymousOrNonStaticLocal(field.getType())) {
            return true;
        }
        if (z3) {
            list = this.serializationStrategies;
        } else {
            list = this.deserializationStrategies;
        }
        if (!list.isEmpty()) {
            FieldAttributes fieldAttributes = new FieldAttributes(field);
            Iterator<ExclusionStrategy> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().shouldSkipField(fieldAttributes)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder m0clone = m0clone();
        m0clone.requireExpose = true;
        return m0clone;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z3, boolean z4) {
        Excluder m0clone = m0clone();
        if (z3) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            m0clone.serializationStrategies = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z4) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            m0clone.deserializationStrategies = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return m0clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder m0clone = m0clone();
        m0clone.modifiers = 0;
        for (int i4 : iArr) {
            m0clone.modifiers = i4 | m0clone.modifiers;
        }
        return m0clone;
    }

    public Excluder withVersion(double d4) {
        Excluder m0clone = m0clone();
        m0clone.version = d4;
        return m0clone;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m0clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }
}
