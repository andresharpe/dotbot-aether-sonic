package com.amazonaws.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class EncodingSchemeEnum implements l {
    private static final /* synthetic */ EncodingSchemeEnum[] $VALUES;
    public static final EncodingSchemeEnum BASE16;
    public static final EncodingSchemeEnum BASE32;
    public static final EncodingSchemeEnum BASE64;

    /* loaded from: classes.dex */
    enum a extends EncodingSchemeEnum {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // com.amazonaws.util.l
        public byte[] b(String str) {
            return Base16.b(str);
        }

        @Override // com.amazonaws.util.EncodingSchemeEnum, com.amazonaws.util.l
        public String e(byte[] bArr) {
            return Base16.g(bArr);
        }
    }

    static {
        a aVar = new a("BASE16", 0);
        BASE16 = aVar;
        EncodingSchemeEnum encodingSchemeEnum = new EncodingSchemeEnum("BASE32", 1) { // from class: com.amazonaws.util.EncodingSchemeEnum.b
            {
                a aVar2 = null;
            }

            @Override // com.amazonaws.util.l
            public byte[] b(String str) {
                return Base32.b(str);
            }

            @Override // com.amazonaws.util.EncodingSchemeEnum, com.amazonaws.util.l
            public String e(byte[] bArr) {
                return Base32.g(bArr);
            }
        };
        BASE32 = encodingSchemeEnum;
        EncodingSchemeEnum encodingSchemeEnum2 = new EncodingSchemeEnum("BASE64", 2) { // from class: com.amazonaws.util.EncodingSchemeEnum.c
            {
                a aVar2 = null;
            }

            @Override // com.amazonaws.util.l
            public byte[] b(String str) {
                return Base64.b(str);
            }

            @Override // com.amazonaws.util.EncodingSchemeEnum, com.amazonaws.util.l
            public String e(byte[] bArr) {
                return Base64.g(bArr);
            }
        };
        BASE64 = encodingSchemeEnum2;
        $VALUES = new EncodingSchemeEnum[]{aVar, encodingSchemeEnum, encodingSchemeEnum2};
    }

    private EncodingSchemeEnum(String str, int i4) {
    }

    public static EncodingSchemeEnum valueOf(String str) {
        return (EncodingSchemeEnum) Enum.valueOf(EncodingSchemeEnum.class, str);
    }

    public static EncodingSchemeEnum[] values() {
        return (EncodingSchemeEnum[]) $VALUES.clone();
    }

    @Override // com.amazonaws.util.l
    public abstract String e(byte[] bArr);

    /* synthetic */ EncodingSchemeEnum(String str, int i4, a aVar) {
        this(str, i4);
    }
}
