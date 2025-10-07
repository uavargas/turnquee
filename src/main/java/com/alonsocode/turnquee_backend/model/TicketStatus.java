package com.alonsocode.turnquee_backend.model;

public enum TicketStatus {
    CREATED, CALLED, SERVED, CANCELLED;
// Metodos para verificar el estado del ticket
    public boolean isPending() {
        return this == CREATED;
    }
    public boolean isCompleted() {
        return this == SERVED || this == CANCELLED;
    }
}
