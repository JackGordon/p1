package com.revature.banksy.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "senders")
public class Senders implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "transaction_id", nullable = false)
    private Integer transactionId;

//    @Id
    @Column(name = "account_id", nullable = false)
    private Integer accountId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Senders senders = (Senders) o;
        return transactionId != null && Objects.equals(transactionId, senders.transactionId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
