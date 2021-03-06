package ru.dude.simplepeg.entity;

/**
 * PEG operation types
 *
 * Типы операций в peg-грамматике. Фиксированный набор.
 * Created by dude on 29.10.2017.
 */
public enum SpegTypes {
    SEQUENCE,
    ORDERED_CHOICE,
    ONE_OR_MORE,
    ZERO_OR_MORE,
    REGEXP,
    STRING,
    OPTIONAL,
    END_OF_FILE,
    NOT,
}
