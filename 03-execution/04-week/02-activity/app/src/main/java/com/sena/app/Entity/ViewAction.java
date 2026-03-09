package com.sena.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "view_action")
public class ViewAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "view_id", nullable = false)
    private View viewId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "action_id", nullable = false)
    private Action actionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public View getViewId() {
        return viewId;
    }

    public void setViewId(View viewId) {
        this.viewId = viewId;
    }

    public Action getActionId() {
        return actionId;
    }

    public void setActionId(Action actionId) {
        this.actionId = actionId;
    }
}
