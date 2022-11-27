package fr.isc.crypto.core;

public interface Cypher {
  String cypher(String text);
  String decipher(String text);
}
