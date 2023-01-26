package org.example.seminar4.HW4.planer;

public interface Format { //интерфейс создания строк для разных форматов файла
    <T extends Task> String createString(T task);
}
