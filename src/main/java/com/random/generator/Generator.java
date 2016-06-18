package com.random.generator;

import com.random.generator.spec.Generator;
import com.random.generator.ByteArrayGenerator;
/**
 * Created by Mayank Punetha on 13-06-2016.
 */
@SuppressWarnings("DefaultFileTemplate")
class RandomGenerator {

    public RandomGenerator(){
        addDefaultGenerator(byte[].class, ByteArrayGenerator.lass);
        addDefaultGenerator(char[].class, CharArrayGenerator.class);
        addDefaultGenerator(short[].class, ShortArrayGenerator.class);
        addDefaultGenerator(int[].class, IntArrayGenerator.class);
        addDefaultGenerator(long[].class, LongArrayGenerator.class);
        addDefaultGenerator(float[].class, FloatArrayGenerator.class);
        addDefaultGenerator(double[].class, DoubleArrayGenerator.class);
        addDefaultGenerator(boolean[].class, BooleanArrayGenerator.class);
        addDefaultGenerator(String[].class, StringArrayGenerator.class);
        addDefaultGenerator(Object[].class, ObjectArrayGenerator.class);
        addDefaultGenerator(KryoSerializable.class, KryoSerializableGenerator.class);
        addDefaultGenerator(BigInteger.class, BigIntegerGenerator.class);
        addDefaultGenerator(BigDecimal.class, BigDecimalGenerator.class);
        addDefaultGenerator(Class.class, ClassGenerator.class);
        addDefaultGenerator(Date.class, DateGenerator.class);
        addDefaultGenerator(Enum.class, EnumGenerator.class);
        addDefaultGenerator(EnumSet.class, EnumSetGenerator.class);
        addDefaultGenerator(Currency.class, CurrencyGenerator.class);
        addDefaultGenerator(StringBuffer.class, StringBufferGenerator.class);
        addDefaultGenerator(StringBuilder.class, StringBuilderGenerator.class);
        addDefaultGenerator(Collections.EMPTY_LIST.getClass(), CollectionsEmptyListGenerator.class);
        addDefaultGenerator(Collections.EMPTY_MAP.getClass(), CollectionsEmptyMapGenerator.class);
        addDefaultGenerator(Collections.EMPTY_SET.getClass(), CollectionsEmptySetGenerator.class);
        addDefaultGenerator(Collections.singletonList(null).getClass(), CollectionsSingletonListGenerator.class);
        addDefaultGenerator(Collections.singletonMap(null, null).getClass(), CollectionsSingletonMapGenerator.class);
        addDefaultGenerator(Collections.singleton(null).getClass(), CollectionsSingletonSetGenerator.class);
        addDefaultGenerator(TreeSet.class, TreeSetGenerator.class);
        addDefaultGenerator(Collection.class, CollectionGenerator.class);
        addDefaultGenerator(TreeMap.class, TreeMapGenerator.class);
        addDefaultGenerator(Map.class, MapGenerator.class);
        addDefaultGenerator(TimeZone.class, TimeZoneGenerator.class);
        addDefaultGenerator(Calendar.class, CalendarGenerator.class);
        addDefaultGenerator(Locale.class, LocaleGenerator.class);
        addDefaultGenerator(Charset.class, CharsetGenerator.class);
        addDefaultGenerator(int.class, URLGenerator.class);
        addDefaultGenerator(String.class, URLGenerator.class);
        addDefaultGenerator(float.class, URLGenerator.class);
        addDefaultGenerator(boolean.class, URLGenerator.class);
        addDefaultGenerator(byte.class, URLGenerator.class);
        addDefaultGenerator(char.class, URLGenerator.class);
        addDefaultGenerator(short.class, URLGenerator.class);
        addDefaultGenerator(long.class, URLGenerator.class);
        addDefaultGenerator(double.class, URLGenerator.class);
    }

    private void addDefaultGenerator(Class type, Generator generator) {
        if (type == null) throw new IllegalArgumentException("type cannot be null.");
        if (generator == null) throw new IllegalArgumentException("Generator cannot be null.");
        DefaultGeneratorEntry entry = new DefaultGeneratorEntry(type, new PseudoGeneratorFactory(Generator));
        defaultGenerators.add(defaultGenerators.size() - lowPriorityDefaultGeneratorCount, entry);
    }
}
