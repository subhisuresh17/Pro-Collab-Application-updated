package proCollab.projectManagement.capstoneProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import proCollab.projectManagement.capstoneProject.model.Project;
import proCollab.projectManagement.capstoneProject.model.User;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByCompanyId(Long companyId);
    List<Project> findByCreator(User user);
    long countByCreatorAndIsCompletedTrue(User user);

}
