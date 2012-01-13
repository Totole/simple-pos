/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.alexvariasi.entity.transaction;

import com.stripbandunk.alexvariasi.entity.AbstractEntity;
import com.stripbandunk.jwidget.annotation.TableColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author echo
 */
@Entity
@Table(name = "tabel_pemasukkan")
public class Pemasukkan extends AbstractEntity<Long> {

    @Id
    @GeneratedValue
    @TableColumn(number = 1, name = "Id")
    private Long id;

    @Column(name = "nama")
    @TableColumn(number = 2, name = "Nama")
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
