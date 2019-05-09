package com.chasegarsee.orders.repos;

import com.chasegarsee.orders.model.Agents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agents, Long>
{
}
