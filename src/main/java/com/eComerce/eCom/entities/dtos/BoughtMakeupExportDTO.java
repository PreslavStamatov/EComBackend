package com.eComerce.eCom.entities.dtos;


import jakarta.annotation.Nullable;

public class BoughtMakeupExportDTO {

    private MakeupExportDTO makeup;

    @Nullable
    private ShadeDTO shade;

    public BoughtMakeupExportDTO(MakeupExportDTO makeup, ShadeDTO shade) {
        this.makeup = makeup;
        this.shade = shade;
    }

    public BoughtMakeupExportDTO() {
    }


    public void setMakeup(MakeupExportDTO makeup) {
        this.makeup = makeup;
    }

    public MakeupExportDTO getMakeup() {
        return makeup;
    }

    public ShadeDTO getShade() {
        return shade;
    }

    public void setShade(ShadeDTO shade) {
        this.shade = shade;
    }

    public void setShadeName(String shadeName) {
        this.shade.setName(shadeName);
    }

    public void setShadeColor(String color) {
        this.shade.setColor(color);
    }

    public void setShadeUndertone(String undertone) {
        this.shade.setUndertone(undertone);
    }

    public void setMakeupShades(String parameter) {this.makeup.setShades(null);}
}
